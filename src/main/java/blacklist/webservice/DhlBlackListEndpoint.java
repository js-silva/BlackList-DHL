package blacklist.webservice;


import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dhl.ws.blacklist.STBlackListBean;
import com.dhl.ws.blacklist.STBlackListBeanResponse;
import com.dhl.ws.blacklist.STBlackListRequest;
import com.dhl.ws.blacklist.STBlackListResponse;

import blacklist.persist.entity.STBlackList;
import blacklist.persist.repository.STBlackListRepository;
import blacklist.util.Utils;
import blacklist.webservice.validator.DhlBlackListValidatorException;
import blacklist.webservice.validator.Validator;
import blacklist.webservice.validator.Validator90Days;


@Endpoint
public class DhlBlackListEndpoint {
	private static final String NAMESPACE_URI = "http:dhl.com/ws/blacklist";
	
	
	@Autowired
	private STBlackListRepository	objRepository;
	
	
	@Autowired
	public DhlBlackListEndpoint() {
		super();
	}
	

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "STBlackListRequest")
	@ResponsePayload
	public STBlackListResponse getDHLBlackList(@RequestPayload STBlackListRequest request) {
		//RESPONSE
		STBlackListResponse			response	=	new STBlackListResponse();
		STBlackListBeanResponse		bResponse	=	new STBlackListBeanResponse();
		
		try {
			//VALIDAR REQUEST NULL
			if(request == null || request.getRequest() == null || request.getRequest().getStatus() == null) {
				bResponse.setDescription("EL REQUEST DEBE SER NO NULO");
				bResponse.setStatus("Warning");

			} else {
				//VALIDAR DATOS DEL REQUEST
				STBlackListBean r = request.getRequest().getStatus();
				new Validator(r.getDateTime(), r.getFcCd(), r.getNoPcs(), r.getPcsIdShipId(), r.getRCd(), r.getSrvaCd(), r.getTyCd());

				//SE REALIZA LA CARGA POR pcsIdShipId
				Sort sort = new Sort(Direction.DESC, "dateTime");
				List<STBlackList>	objs 	= objRepository.findByPcsIdShipId( Long.parseLong(r.getPcsIdShipId()), sort );
				if( !(objs == null) && !objs.isEmpty() ) {
					STBlackList obj	= objs.get(0);
					System.out.println("Datetime for pcsIdShipId=" + r.getPcsIdShipId() + ": " + obj.getDateTime());
					//VALIDACION -- 3 MESES
					new Validator90Days(obj.getDateTime());
				}

				//INSERT
				STBlackList	objEntity = new STBlackList();
				objEntity.setComDevNo(null);
				objEntity.setCycCd(null);
				objEntity.setDateTime(Utils.getDateFROMFormatedString(r.getDateTime()));
				objEntity.setDayPrd(null);
				objEntity.setDocTyCdST(null);
				objEntity.setDstFcCd(null);
				objEntity.setDstSrvaCd(null);
				objEntity.setDt(null);
				objEntity.setFcCd(r.getFcCd());
				objEntity.setHitYCd(null);
				objEntity.setInstr(null);
				objEntity.setLegalEntity( null);
				objEntity.setLoadDate(new Date());
				objEntity.setNoPcs(Integer.parseInt(r.getNoPcs()));
				objEntity.setnPcsId(null);
				objEntity.setOrgFcCd(null);
				objEntity.setOrgSrvaCd(null);
				objEntity.setPcsIdShipId(Long.parseLong(r.getPcsIdShipId()));
				objEntity.setPudPnt(null);
				objEntity.setrCd(r.getRCd());
				objEntity.setRouteCd(null);
				objEntity.setShpId(null);
				objEntity.setSpcFcId(null);
				objEntity.setSrvaCd(r.getSrvaCd());
				objEntity.setStId(UUID.randomUUID().toString().toUpperCase());
				objEntity.setTyCd(r.getTyCd());
				objEntity.setUploader("webservice");
				objRepository.save(objEntity);

				//RESPONSE
				bResponse.setDescription("PROCESO EJECUTADO CORRECTAMENTE");
				bResponse.setStatus("OK");

			}

		} catch(DhlBlackListValidatorException DhlBLValidatorException) {
			bResponse.setDescription(DhlBLValidatorException.getMessage());
			bResponse.setStatus("Error");

		} finally {
			bResponse.setDateTime(Utils.getDateASFormatedString());
			response.setResponse(bResponse);

		}

		return response;

	}
	

}

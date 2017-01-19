package blacklist.webservice;


import org.springframework.beans.factory.annotation.Autowired;
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
import blacklist.webservice.validator.DhlBlackListValidatorException;
import blacklist.webservice.validator.Validator;


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
	public STBlackListResponse getDHLBlackList(@RequestPayload STBlackListRequest request) throws DhlBlackListException {
		//VALIDAR REQUEST
		if(request == null || request.getRequest() == null || request.getRequest().getStatus() == null) {
			 throw new DhlBlackListException("EL REQUEST DEBE SER NO NULO");
		}
		
		try {
			//VALIDAR DATOS DEL REQUEST
			STBlackListBean r = request.getRequest().getStatus();
			new Validator(r.getDateTime(), r.getFcCd(), r.getNoPcs(), r.getPcsIdShipId(), r.getRCd(), r.getSrvaCd(), r.getTyCd());
		} catch(DhlBlackListValidatorException DhlBLValidatorException) {
			throw new DhlBlackListException(DhlBLValidatorException.getMessage() + "\n" + "EL REQUEST CONTINE DATOS NO VÁLIDOS");
		}
		
		
		STBlackList obj = objRepository.findOne("9BA7AAFB-034E-4A2F-99BD-7EBCF14FCABF");
		System.out.println(obj.getStId());
		System.out.println(obj.getComDevNo());
		System.out.println(obj.getCycCd());
		System.out.println(obj.getDayPrd());
		System.out.println(obj.getDocTyCdST());
		
		
		//
		STBlackListResponse response = new STBlackListResponse();
		
		STBlackListBeanResponse theResponse = new STBlackListBeanResponse();
		theResponse.setDateTime("2016-01-17T12:45:00");
		theResponse.setDescription("EJECUCION DE PRUEBA");
		theResponse.setStatus("OK");
		
		response.setResponse(theResponse);
		
		
		return response;
	}
	
}

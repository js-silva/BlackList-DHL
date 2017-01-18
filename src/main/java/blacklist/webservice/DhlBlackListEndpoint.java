package blacklist.webservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dhl.ws.blacklist.STBlackListBeanResponse;
import com.dhl.ws.blacklist.STBlackListRequest;
import com.dhl.ws.blacklist.STBlackListResponse;


@Endpoint
public class DhlBlackListEndpoint {
	private static final String NAMESPACE_URI = "http:dhl.com/ws/blacklist";

	//private CountryRepository countryRepository;

	@Autowired
	//public DhlBlackListEndpoint(CountryRepository countryRepository) {
	public DhlBlackListEndpoint() {
		//this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "STBlackListRequest")
	@ResponsePayload
	public STBlackListResponse getDHLBlackList(@RequestPayload STBlackListRequest request) {
		STBlackListResponse response = new STBlackListResponse();

		STBlackListBeanResponse theResponse = new STBlackListBeanResponse();
		theResponse.setDateTime("2016-01-17 12:45:00");
		theResponse.setDescription("EJECUCION DE PRUEBA");
		theResponse.setStatus("OK");

		response.setResponse(theResponse);

		return response;
	}

}

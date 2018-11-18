package clients;

import countries.Country;
import countries.GetCountryRequest;
import countries.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport {

    public Country getCountry(String name) {
        GetCountryRequest getCountryRequest = new GetCountryRequest();
        getCountryRequest.setName(name);
        GetCountryResponse getCountryResponse = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive(getCountryRequest);

        return getCountryResponse.getCountry();
    }
}

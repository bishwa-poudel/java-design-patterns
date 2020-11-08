package Structural.AdapterPattern.Adapter;

import Structural.AdapterPattern.Service.WebService;

/**
 * @author Bishwa on 15/10/2020
 */
public class WebAdapter implements IWebRequester {
    private WebService service;

    public void connect(WebService currentService) {
        this.service = currentService;
    }

    @Override
    public int request(Object request) {
        String result = this.toJson(request);
        String response = service.request(result);
        if(response != null) return 200; // OK status code
        return 500; // Server error status code
    }

    private String toJson(Object input) { return "this is json object in real"; }
}

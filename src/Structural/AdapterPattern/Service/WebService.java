package Structural.AdapterPattern.Service;

/**
 * @author Bishwa on 15/10/2020
 */
public class WebService {
    private String webHost;

    public WebService(String webHost) {
        this.webHost = webHost;
    }

    public String request(String jsonRequest) {
        return null;
    }

}

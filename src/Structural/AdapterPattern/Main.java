package Structural.AdapterPattern;

import Structural.AdapterPattern.Adapter.WebAdapter;
import Structural.AdapterPattern.Client.WebClient;
import Structural.AdapterPattern.Service.WebService;

/**
 * @author Bishwa on 15/10/2020
 */
public class Main {
    public static void main(String[] args) {
        String webHost = "https://google.com";
        WebService service = new WebService(webHost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();
    }
}

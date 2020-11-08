package Structural.AdapterPattern.Client;

import Structural.AdapterPattern.Adapter.IWebRequester;

/**
 * @author Bishwa on 15/10/2020
 */
public class WebClient {
    private IWebRequester webRequester;

    public WebClient(IWebRequester webRequester) {
        this.webRequester = webRequester;
    }

    private Object makeObject() {
        return new Object();
    }

    public void doWork() {
        Object object = makeObject();
        int status = webRequester.request(object);

        if(status == 200) {
            System.out.println("OK");
        } else {
            System.out.println("Server error");
        }
    }
}

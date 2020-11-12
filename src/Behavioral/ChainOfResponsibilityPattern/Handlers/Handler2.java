package Behavioral.ChainOfResponsibilityPattern;

/**
 * @author Bishwa on 02/11/2020
 */
public class Handler2 extends IHandler {
    @Override
    public void handleRequest() {
        System.out.println("Handler 2 handling request");
        processNext();
    }
}

package Behavioral.ChainOfResponsibilityPattern.Handlers;

import Behavioral.ChainOfResponsibilityPattern.IHandler;

/**
 * @author Bishwa on 02/11/2020
 */
public class Handler1 extends IHandler {
    @Override
    public void handleRequest() {
        System.out.println("Handler 1 handling request");
        processNext();
    }
}

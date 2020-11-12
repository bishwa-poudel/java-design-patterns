package Behavioral.ChainOfResponsibilityPattern.Handlers;

import Behavioral.ChainOfResponsibilityPattern.IHandler;

/**
 * @author Bishwa on 02/11/2020
 */
public class BaseHandler extends IHandler {
    @Override
    public void handleRequest() {
        System.out.println("Base handler");
        processNext();
    }
}

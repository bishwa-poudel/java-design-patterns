package Behavioral.ChainOfResponsibilityPattern;

import Behavioral.ChainOfResponsibilityPattern.Handlers.BaseHandler;
import Behavioral.ChainOfResponsibilityPattern.Handlers.Handler1;
import Behavioral.ChainOfResponsibilityPattern.Handlers.Handler2;

/**
 * @author Bishwa on 02/11/2020
 */
public class Main {
    public static void main(String[] args) {
        IHandler iHandler = new BaseHandler();

        iHandler.next(new Handler1())
                .next(new Handler2());

        iHandler.handleRequest();
    }
}

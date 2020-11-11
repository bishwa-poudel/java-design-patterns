package Structural.DecoratorPattern.Decorators;

import Structural.DecoratorPattern.IWebPage;
import Structural.DecoratorPattern.WebPageDecorator;

/**
 * @author Bishwa on 15/10/2020
 */
public class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(IWebPage webPage) {
        super(webPage);
    }

    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }

    private void authenticateUser() {
        System.out.println("Running authentication hook");
    }
}

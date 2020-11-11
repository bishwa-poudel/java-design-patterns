package Structural.DecoratorPattern.Decorators;

import Structural.DecoratorPattern.IWebPage;
import Structural.DecoratorPattern.WebPageDecorator;

/**
 * @author Bishwa on 15/10/2020
 */
public class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(IWebPage webPage) {
        super(webPage);
    }

    @Override
    public void display() {
        super.display();
        this.authorizeUser();
    }

    public void authorizeUser() {
        System.out.println("Running Authorization hook");
    }
}

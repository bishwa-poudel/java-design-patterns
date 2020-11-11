package Structural.DecoratorPattern;

import Structural.DecoratorPattern.BaseComponent.BasicWebPage;
import Structural.DecoratorPattern.Decorators.AuthenticatedWebPage;
import Structural.DecoratorPattern.Decorators.AuthorizedWebPage;

/**
 * @author Bishwa on 15/10/2020
 */
public class MainProgram {
    public static void main(String[] args) {
        IWebPage myPage = new BasicWebPage();
        myPage = new AuthenticatedWebPage(myPage);
        myPage = new AuthorizedWebPage(myPage);

        myPage.display();
    }
}

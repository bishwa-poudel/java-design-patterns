package Structural.DecoratorPattern;

/**
 * @author Bishwa on 15/10/2020
 */
public abstract class WebPageDecorator implements IWebPage{
    protected IWebPage webPage;

    public WebPageDecorator(IWebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        this.webPage.display();
    }
}
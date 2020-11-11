package Structural.DecoratorPattern.BaseComponent;

import Structural.DecoratorPattern.IWebPage;

/**
 * @author Bishwa on 15/10/2020
 */
public class BasicWebPage implements IWebPage {
    private String html = "Some html";
    private String styleSheet = "Some css";
    private String scripts = "Some JS";

    @Override
    public void display() {
        System.out.println("Rendering HTML, CSS and JS ");
    }
}

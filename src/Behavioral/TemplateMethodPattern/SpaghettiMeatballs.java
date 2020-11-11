package Behavioral.TemplateMethodPattern;

/**
 * @author Bishwa on 16/10/2020
 */
public class SpaghettiMeatballs extends PastaDish {
    @Override
    protected void addPasta() {
        System.out.println("Add spaghetti");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add tomato sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add meatballs");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add parmesan cheese");
    }
}

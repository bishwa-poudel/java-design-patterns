package Behavioral.TemplateMethodPattern;

/**
 * @author Bishwa on 16/10/2020
 */
public class PenneAlfredo extends PastaDish {
    @Override
    protected void addPasta() {
        System.out.println("Add penne");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add alfredo sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add chicken");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add parsley");
    }
}

package Behavioral.TemplateMethodPattern;

/**
 * @author Bishwa on 18/10/2020
 */
public class Main {
    public static void main(String[] args) {
        PastaDish dish1 = new PenneAlfredo();
        dish1.makeRecipe();

        SpaghettiMeatballs dish2 = new SpaghettiMeatballs();
        dish2.makeRecipe();
        
    }
}

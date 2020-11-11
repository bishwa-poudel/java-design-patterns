package Behavioral.TemplateMethodPattern;

/**
 * @author Bishwa on 16/10/2020
 */
public abstract class PastaDish {
    public final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void cookPasta() {
        System.out.println("Cooking pasta");
    }
}

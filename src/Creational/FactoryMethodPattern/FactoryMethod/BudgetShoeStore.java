package Creational.FactoryMethodPattern.FactoryMethod;

/**
 * @author Bishwa on 14/10/2020
 */
public class BudgetShoeStore extends ShoeStore {
    @Override
    Shoe createShoe(String shoeType) {
        if(shoeType.equals("party")) {
            return new BudgetPartyShoe();
        } else if (shoeType.equals("casual")) {
            return new BudgetCasualShoe();
        }
        // ... more types to be added here

        return null;
    }
}

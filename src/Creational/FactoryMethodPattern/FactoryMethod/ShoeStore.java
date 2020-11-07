package Creational.FactoryMethodPattern.FactoryMethod;

/**
 * @author Bishwa on 14/10/2020
 */
public abstract class ShoeStore {
    public Shoe orderShoe(String shoeType) {
        Shoe shoe;

        // now creating shoe is a method in this class
        shoe = createShoe(shoeType);

        shoe.polish();
        shoe.pack();

        return shoe;
    }

    abstract Shoe createShoe(String shoeType);
}

package Creational.FactoryMethodPattern.FactoryObject;

import Creational.FactoryMethodPattern.Shoe;

/**
 * @author Bishwa on 13/10/2020
 */
public class ShoeStore {
    private ShoeFactory shoeFactory;

    public ShoeStore(ShoeFactory shoeFactory) {
        this.shoeFactory = shoeFactory;
    }

    public Shoe orderShoe(String shoeType) {
        Shoe shoe = shoeFactory.createShoe(shoeType);

        shoe.polish();
        shoe.pack();
        
        return shoe;
    }
}

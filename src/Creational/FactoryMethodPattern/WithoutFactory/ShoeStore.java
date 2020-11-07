package Creational.FactoryMethodPattern.WithoutFactory;

import Creational.FactoryMethodPattern.CasualShoe;
import Creational.FactoryMethodPattern.PartyShoe;
import Creational.FactoryMethodPattern.Shoe;

/**
 * @author Bishwa on 11/10/2020
 */
public class ShoeStore {
    public Shoe orderShoe(String type) {
        Shoe shoe = null;

        // create shoe object - concrete instantiation
        if(type.equals("party")) {
            shoe = new PartyShoe();
        } else if (type.equals("casual")) {
            shoe = new CasualShoe();
        }

        // do things after shoe object is created
        shoe.polish();
        shoe.pack();

        return shoe;
    }
}

package Creational.FactoryMethodPattern.FactoryObject;

import Creational.FactoryMethodPattern.CasualShoe;
import Creational.FactoryMethodPattern.PartyShoe;
import Creational.FactoryMethodPattern.Shoe;

/**
 * @author Bishwa on 13/10/2020
 */
public class ShoeFactory {
    public Shoe createShoe(String shoeType) {
        Shoe shoe = null;

        // create shoe object - concrete instantiation
        if(shoeType.equals("party")) {
            shoe = new PartyShoe();
        } else if (shoeType.equals("casual")) {
            shoe = new CasualShoe();
        }

        return shoe;
    }
}

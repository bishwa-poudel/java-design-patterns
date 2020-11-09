package Structural.CompositePattern.Composites;

import Structural.CompositePattern.IStructure;

/**
 * @author Bishwa on 15/10/2020
 */
public class Room implements IStructure {
    public String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void location() {

    }

    @Override
    public String getName() {
        return null;
    }
}

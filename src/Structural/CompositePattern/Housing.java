package Structural.CompositePattern;

import java.util.ArrayList;

/**
 * @author Bishwa on 15/10/2020
 */
public class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing (String address) {
        this.structures = new ArrayList<>();
        this.address = address;
    }

    @Override
    public String getName() {
        return address;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
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
}

package Structural.AdapterPattern.Example;

/**
 * @author Bishwa on 15/10/2020
 */
public interface CoffeeMachineInterface {
    public void connect(OldCoffeeMachine oldCoffeeMachine);
    public void chooseFirstSelection();
    public void chooseSecondSelection();
}

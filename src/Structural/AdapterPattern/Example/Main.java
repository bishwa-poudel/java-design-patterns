package Structural.AdapterPattern.Example;

/**
 * @author Bishwa on 15/10/2020
 */
public class Main {
    public static void main(String[] args) {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeMachineInterface adapter = new CoffeeTouchscreenAdapter();

        adapter.connect(oldCoffeeMachine);

        adapter.chooseFirstSelection();
        adapter.chooseSecondSelection();
    }
}

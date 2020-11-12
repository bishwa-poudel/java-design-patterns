package Behavioral.StatePattern;

import Behavioral.StatePattern.Context.Context;

/**
 * @author Bishwa on 02/11/2020
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.printStatus();

        context.nextState();
        context.printStatus();

        context.nextState();
        context.printStatus();

        context.nextState();
    }
}

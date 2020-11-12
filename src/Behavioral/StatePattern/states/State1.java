package Behavioral.StatePattern.states;

import Behavioral.StatePattern.Context.Context;
import Behavioral.StatePattern.IState;

/**
 * @author Bishwa on 03/11/2020
 */
public class State1 implements IState {
    @Override
    public void next(Context context) {
        context.setState(new State2());
    }

    @Override
    public void prev(Context context) {
        System.out.println("Object already in Root state");
    }

    @Override
    public void printStatus() {
        System.out.println("Current state is State 1");
    }
}

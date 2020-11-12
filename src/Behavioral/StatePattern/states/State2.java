package Behavioral.StatePattern.states;

import Behavioral.StatePattern.Context.Context;
import Behavioral.StatePattern.IState;

/**
 * @author Bishwa on 03/11/2020
 */
public class State2 implements IState {
    @Override
    public void next(Context context) {
        context.setState(new State3());
    }

    @Override
    public void prev(Context context) {
        context.setState(new State1());
    }

    @Override
    public void printStatus() {
        System.out.println("Current state is State 2");
    }
}

package Behavioral.StatePattern.Context;

import Behavioral.StatePattern.IState;
import Behavioral.StatePattern.states.State1;

/**
 * @author Bishwa on 03/11/2020
 */
public class Context {
    private IState state = new State1();

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}

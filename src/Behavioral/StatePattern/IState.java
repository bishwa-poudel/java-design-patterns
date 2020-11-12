package Behavioral.StatePattern;

import Behavioral.StatePattern.Context.Context;

/**
 * @author Bishwa on 02/11/2020
 */
public interface IState {
    void next(Context context);
    void prev(Context context);
    void printStatus();
}

package Behavioral.CommandPattern.Invoker;

import Behavioral.CommandPattern.ICommand;

/**
 * @author Bishwa on 04/11/2020
 */
public class RemoteControl {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

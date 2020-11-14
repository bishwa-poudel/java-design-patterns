package Behavioral.CommandPattern.Commands;

import Behavioral.CommandPattern.ICommand;
import Behavioral.CommandPattern.Receiver.Light;

/**
 * @author Bishwa on 04/11/2020
 */
public class LightOnCommand implements ICommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning light on");
        light.switchOn();
    }
}

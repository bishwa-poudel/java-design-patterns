package Behavioral.CommandPattern.Commands;

import Behavioral.CommandPattern.ICommand;
import Behavioral.CommandPattern.Receiver.Light;

/**
 * @author Bishwa on 04/11/2020
 */
public class LightOffCommand implements ICommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning light off");
        light.switchOff();
    }
}

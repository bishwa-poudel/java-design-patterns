package Behavioral.CommandPattern;

import Behavioral.CommandPattern.Commands.LightOffCommand;
import Behavioral.CommandPattern.Commands.LightOnCommand;
import Behavioral.CommandPattern.Invoker.RemoteControl;
import Behavioral.CommandPattern.Receiver.Light;

/**
 * @author Bishwa on 04/11/2020
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();

        // switch on
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();

        // switch off
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.pressButton();
    }
}

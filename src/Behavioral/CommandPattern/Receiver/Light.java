package Behavioral.CommandPattern.Receiver;

/**
 * @author Bishwa on 04/11/2020
 */
public class Light {
    private boolean on = false;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }
}

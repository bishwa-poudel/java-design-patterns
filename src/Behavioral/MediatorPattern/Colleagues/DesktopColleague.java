package Behavioral.MediatorPattern.Colleagues;

import Behavioral.MediatorPattern.Colleague;
import Behavioral.MediatorPattern.IMediator;

/**
 * @author Bishwa on 04/11/2020
 */
public class DesktopColleague extends Colleague {
    public DesktopColleague(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Desktop received message");
    }
}

package Behavioral.MediatorPattern;

import Behavioral.MediatorPattern.Colleagues.DesktopColleague;
import Behavioral.MediatorPattern.Colleagues.MobileColleague;
import Behavioral.MediatorPattern.Colleagues.WebColleague;
import Behavioral.MediatorPattern.Mediators.NotificationMediator;

/**
 * @author Bishwa on 04/11/2020
 */
public class NotificationClient {
    public static void main(String[] args) {
        IMediator mediator = new NotificationMediator();

        Colleague desktop = new DesktopColleague(mediator);
        Colleague mobile = new MobileColleague(mediator);
        Colleague web = new WebColleague(mediator);

        mediator.registerColleague(desktop);
        mediator.registerColleague(mobile);
        mediator.registerColleague(web);

        desktop.send("Hello from desktop");
    }
}

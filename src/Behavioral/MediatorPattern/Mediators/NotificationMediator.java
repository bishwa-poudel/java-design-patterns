package Behavioral.MediatorPattern.Mediators;

import Behavioral.MediatorPattern.Colleague;
import Behavioral.MediatorPattern.IMediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bishwa on 04/11/2020
 */
public class NotificationMediator implements IMediator {
    private List<Colleague> colleagues;

    public NotificationMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void registerColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        colleagues.forEach(colleague -> {
            // message should be received by all colleagues except the one sending it
            if(colleague != originator) colleague.receive(message);
        });
    }
}

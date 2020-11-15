package Behavioral.MediatorPattern;

/**
 * @author Bishwa on 04/11/2020
 */
public abstract class Colleague {
    private IMediator mediator;

    public Colleague(IMediator mediator) {
        this.mediator = mediator;
    }

    // send message via mediator
    public void send(String message) {
        mediator.send(message, this);
    }

    public IMediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}

package Behavioral.ChainOfResponsibilityPattern;

/**
 * @author Bishwa on 31/10/2020
 */
public abstract class IHandler {
    protected IHandler next;

    public IHandler next(IHandler next) {
        this.next = next;
        return next;
    }

    public abstract void handleRequest();

    protected void processNext() {
        if(next == null) return;

        next.handleRequest();
    }
}

package Behavioral.MediatorPattern;

/**
 * @author Bishwa on 04/11/2020
 */
public interface IMediator {
    void send(String message, Colleague colleague);
    void registerColleague(Colleague colleague);
}

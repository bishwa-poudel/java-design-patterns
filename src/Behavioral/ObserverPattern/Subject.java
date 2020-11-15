package Behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bishwa on 04/11/2020
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

}

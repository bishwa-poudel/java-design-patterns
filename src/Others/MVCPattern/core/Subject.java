package Others.MVCPattern.core;

import Others.MVCPattern.Model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bishwa on 05/11/2020
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(List<Item> item) {
        observers.forEach(observer -> observer.update(item));
    }
}

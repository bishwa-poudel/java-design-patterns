package Behavioral.ObserverPattern.Observers;

import Behavioral.ObserverPattern.Observer;

/**
 * @author Bishwa on 05/11/2020
 */
public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " received a mail for new blog post.");
    }
}

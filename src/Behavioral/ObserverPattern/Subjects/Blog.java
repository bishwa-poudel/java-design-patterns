package Behavioral.ObserverPattern.Subjects;

import Behavioral.ObserverPattern.Subject;

/**
 * @author Bishwa on 05/11/2020
 */
public class Blog extends Subject {
    private String title;
    private String content;

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void addPost() {
        System.out.println("New post created. Notifying subscribers");
        this.notifyObservers();
    }
}

package Behavioral.ObserverPattern;

import Behavioral.ObserverPattern.Observers.Person;
import Behavioral.ObserverPattern.Subjects.Blog;

/**
 * @author Bishwa on 05/11/2020
 */
public class Main {
    public static void main(String[] args) {
        Observer alice = new Person("Alice");
        Observer alex = new Person("Alex");
        Observer biden = new Person("Biden");

        Blog blog = new Blog("Title", "Content");
        blog.registerObserver(alice);
        blog.registerObserver(alex);
        blog.registerObserver(biden);

        blog.addPost();
    }
}

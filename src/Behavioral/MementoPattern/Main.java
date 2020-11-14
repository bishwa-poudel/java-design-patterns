package Behavioral.MementoPattern;

import Behavioral.MementoPattern.Caretaker.TextEditor;
import Behavioral.MementoPattern.Originator.TextBox;

/**
 * @author Bishwa on 03/11/2020
 */
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextBox());
        textEditor.write("This is 1st text\n");
        textEditor.write("This is added text\n");

        textEditor.hitSave(); // saving state

        textEditor.write("Added after saving\n");

        textEditor.hitUndo(); //
    }
}

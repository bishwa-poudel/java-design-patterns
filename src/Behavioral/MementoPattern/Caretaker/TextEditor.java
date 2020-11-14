package Behavioral.MementoPattern.Caretaker;

import Behavioral.MementoPattern.Memento.TextState;
import Behavioral.MementoPattern.Originator.TextBox;

/**
 * @author Bishwa on 03/11/2020
 */
public class TextEditor {
    private TextBox textBox;
    private TextState savedTextState;

    public TextEditor(TextBox textBox) {
        this.textBox = textBox;
    }

    public void hitSave() {
        savedTextState = textBox.save();
    }

    public void hitUndo() {
        textBox.restore(savedTextState);
    }

    public void write(String text) {
        textBox.addText(text);
    }
}

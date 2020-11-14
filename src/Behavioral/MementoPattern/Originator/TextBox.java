package Behavioral.MementoPattern.Originator;

import Behavioral.MementoPattern.Memento.TextState;

/**
 * @author Bishwa on 03/11/2020
 */
public class TextBox {
    private StringBuilder currentText;

    public TextBox() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        this.currentText.append(text);
    }

    public TextState save() {
        return new TextState(currentText.toString());
    }

    public void restore(TextState state) {
        currentText = new StringBuilder(state.getText());
    }
}

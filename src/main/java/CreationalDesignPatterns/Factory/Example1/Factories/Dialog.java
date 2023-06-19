package CreationalDesignPatterns.Factory.Example1.Factories;

import CreationalDesignPatterns.Factory.Example1.Buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

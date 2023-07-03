package CreationalDesignPatterns.Factory.Example1.Factories;

import CreationalDesignPatterns.Factory.Example1.Buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        System.out.println("Created Button class: " + okButton.getClass().getName());
        okButton.render();
    }

    public abstract Button createButton();
}

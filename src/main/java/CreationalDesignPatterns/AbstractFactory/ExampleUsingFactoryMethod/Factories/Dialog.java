package CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Buttons.Button;

public abstract class Dialog {
    protected Button okButton;

    public Dialog() {
        createButton();
    }

    protected abstract void createButton();

    public void renderWindow() {
        System.out.println("Created Button class: " + okButton.getClass().getName());
        okButton.render();
    }
}

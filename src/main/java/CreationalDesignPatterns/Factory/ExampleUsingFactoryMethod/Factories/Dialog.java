package CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        System.out.println("Created Button class: " + okButton.getClass().getName());
        okButton.render();
    }

    public abstract Button createButton();
}

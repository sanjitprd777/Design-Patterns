package CreationalDesignPatterns.AbstractFactory.Example1;

import CreationalDesignPatterns.AbstractFactory.Example1.Buttons.Button;
import CreationalDesignPatterns.AbstractFactory.Example1.Factories.GUIFactory;

public class Application {
    private final Button button;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
    }

    public void press() {
        button.pressButton();
    }
}

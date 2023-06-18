package CreationalDesignPatterns.AbstractFactory.Example1.Factories;

import CreationalDesignPatterns.AbstractFactory.Example1.Buttons.Button;
import CreationalDesignPatterns.AbstractFactory.Example1.Buttons.MacButton;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
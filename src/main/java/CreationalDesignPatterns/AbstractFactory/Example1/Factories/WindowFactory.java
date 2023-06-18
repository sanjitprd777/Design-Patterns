package CreationalDesignPatterns.AbstractFactory.Example1.Factories;

import CreationalDesignPatterns.AbstractFactory.Example1.Buttons.Button;
import CreationalDesignPatterns.AbstractFactory.Example1.Buttons.WindowButton;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
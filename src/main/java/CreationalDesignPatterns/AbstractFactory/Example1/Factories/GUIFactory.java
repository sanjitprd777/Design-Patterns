package CreationalDesignPatterns.AbstractFactory.Example1.Factories;

import CreationalDesignPatterns.AbstractFactory.Example1.Buttons.Button;

public interface GUIFactory {

    Button createButton();
}
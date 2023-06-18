package CreationalDesignPatterns.AbstractFactory.Example1;

import CreationalDesignPatterns.AbstractFactory.Example1.Factories.GUIFactory;
import CreationalDesignPatterns.AbstractFactory.Example1.Factories.MacFactory;

public class Demo {

    private static GUIFactory determineOS() {
        // logic to find OS type
        return new MacFactory();
    }

    public static void main(String[] args) {
        GUIFactory factory = determineOS();
        Application app = new Application(factory);
        app.press();
    }
}

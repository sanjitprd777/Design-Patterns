package CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    protected void createButton() {
        okButton = new WindowsButton();
    }
}

package CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    protected void createButton() {
        okButton = new WindowsButton();
    }
}

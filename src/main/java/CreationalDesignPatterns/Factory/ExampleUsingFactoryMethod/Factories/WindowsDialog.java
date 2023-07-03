package CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.Button;
import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

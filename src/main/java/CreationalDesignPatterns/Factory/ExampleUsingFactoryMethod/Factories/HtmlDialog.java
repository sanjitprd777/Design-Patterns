package CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.Button;
import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

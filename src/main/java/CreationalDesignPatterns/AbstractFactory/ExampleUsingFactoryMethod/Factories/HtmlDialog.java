package CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    protected void createButton() {
        okButton = new HtmlButton();
    }
}

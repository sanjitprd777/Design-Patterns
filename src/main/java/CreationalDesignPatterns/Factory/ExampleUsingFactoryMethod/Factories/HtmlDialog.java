package CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    protected void createButton() {
        okButton = new HtmlButton();
    }
}

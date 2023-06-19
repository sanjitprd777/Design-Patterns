package CreationalDesignPatterns.Factory.Example1.Factories;

import CreationalDesignPatterns.Factory.Example1.Buttons.Button;
import CreationalDesignPatterns.Factory.Example1.Buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

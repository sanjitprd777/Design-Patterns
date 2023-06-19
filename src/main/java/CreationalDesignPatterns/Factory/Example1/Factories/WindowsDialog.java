package CreationalDesignPatterns.Factory.Example1.Factories;

import CreationalDesignPatterns.Factory.Example1.Buttons.Button;
import CreationalDesignPatterns.Factory.Example1.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

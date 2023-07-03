package CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod;

import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Buttons.Button;
import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories.Dialog;
import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories.HtmlDialog;
import CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories.WindowsDialog;

public class Demo {

    public static void main(String ...args) {
        Dialog dialog = new WindowsDialog();
        Button button = dialog.createButton();
        button.render();

        dialog = new HtmlDialog();
        dialog.renderWindow();
    }
}

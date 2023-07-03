package CreationalDesignPatterns.Factory.Example1;

import CreationalDesignPatterns.Factory.Example1.Buttons.Button;
import CreationalDesignPatterns.Factory.Example1.Factories.Dialog;
import CreationalDesignPatterns.Factory.Example1.Factories.HtmlDialog;
import CreationalDesignPatterns.Factory.Example1.Factories.WindowsDialog;

public class Demo {

    public static void main(String ...args) {
        Dialog dialog = new WindowsDialog();
        Button button = dialog.createButton();
        button.render();

        dialog = new HtmlDialog();
        dialog.renderWindow();
    }
}

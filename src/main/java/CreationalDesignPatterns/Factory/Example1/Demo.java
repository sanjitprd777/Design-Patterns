package CreationalDesignPatterns.Factory.Example1;

import CreationalDesignPatterns.Factory.Example1.Factories.Dialog;
import CreationalDesignPatterns.Factory.Example1.Factories.HtmlDialog;
import CreationalDesignPatterns.Factory.Example1.Factories.WindowsDialog;

public class Demo {

    public static void main(String ...args) {
        Dialog dialog = new WindowsDialog();
        dialog.renderWindow();

        dialog = new HtmlDialog();
        dialog.renderWindow();
    }
}

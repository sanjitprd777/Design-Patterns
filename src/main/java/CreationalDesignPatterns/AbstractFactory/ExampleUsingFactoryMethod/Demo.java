package CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod;

import CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Factories.Dialog;
import CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Factories.DialogCreator;
import CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Factories.DialogEnum;

public class Demo {

    public static void main(String ...args) {
        Dialog dialog = DialogCreator.CreateDialog(DialogEnum.HTML_DIALOG);
        dialog.renderWindow();

        Dialog dialog1 = DialogCreator.CreateDialog(DialogEnum.WINDOWS_DIALOG);
        dialog1.renderWindow();
    }
}

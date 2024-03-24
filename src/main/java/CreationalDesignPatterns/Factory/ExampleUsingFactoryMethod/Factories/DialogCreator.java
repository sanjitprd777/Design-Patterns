package CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories;

import static CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories.DialogEnum.HTML_DIALOG;
import static CreationalDesignPatterns.Factory.ExampleUsingFactoryMethod.Factories.DialogEnum.WINDOWS_DIALOG;

public class DialogCreator {

    public static Dialog CreateDialog(DialogEnum dialogEnum) {
        return switch (dialogEnum) {
            case HTML_DIALOG -> new HtmlDialog();
            case WINDOWS_DIALOG -> new WindowsDialog();
        };
    }
}

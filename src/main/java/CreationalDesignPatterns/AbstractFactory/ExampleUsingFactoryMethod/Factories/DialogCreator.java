package CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Factories;

public class DialogCreator {

    public static Dialog CreateDialog(DialogEnum dialogEnum) {
        return switch (dialogEnum) {
            case HTML_DIALOG -> new HtmlDialog();
            case WINDOWS_DIALOG -> new WindowsDialog();
        };
    }
}

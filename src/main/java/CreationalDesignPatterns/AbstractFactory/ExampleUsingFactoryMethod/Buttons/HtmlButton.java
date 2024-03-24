package CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("You clicked HTML button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}

package CreationalDesignPatterns.AbstractFactory.ExampleUsingFactoryMethod.Buttons;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("You clicked Windows button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello!'");
    }
}

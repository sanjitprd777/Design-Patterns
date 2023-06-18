package CreationalDesignPatterns.AbstractFactory.Example1.Buttons;

public class WindowButton implements Button {
    @Override
    public void pressButton() {
        System.out.println("You pressed Window Button");
    }
}

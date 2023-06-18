package CreationalDesignPatterns.AbstractFactory.Example1.Buttons;

public class MacButton implements Button {

    @Override
    public void pressButton() {
        System.out.println("You pressed MacBook Button");
    }
}

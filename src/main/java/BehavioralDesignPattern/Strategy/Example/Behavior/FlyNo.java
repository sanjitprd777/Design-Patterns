package BehavioralDesignPattern.Strategy.Example.Behavior;

public class FlyNo implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}

package BehavioralDesignPattern.Strategy.Example.Behavior;

public class QuackYes implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can Quack");
    }
}

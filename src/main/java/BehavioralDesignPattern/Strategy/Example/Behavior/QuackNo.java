package BehavioralDesignPattern.Strategy.Example.Behavior;

public class QuackNo implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can not quack");
    }
}

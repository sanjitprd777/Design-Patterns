package BehavioralDesignPattern.Strategy.Example.Duck;

import BehavioralDesignPattern.Strategy.Example.Behavior.FlyWithWings;
import BehavioralDesignPattern.Strategy.Example.Behavior.QuackYes;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super("MallardDuck", new FlyWithWings(), new QuackYes());
    }
}

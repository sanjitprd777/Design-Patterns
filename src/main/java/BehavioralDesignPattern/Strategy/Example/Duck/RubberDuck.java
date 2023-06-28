package BehavioralDesignPattern.Strategy.Example.Duck;

import BehavioralDesignPattern.Strategy.Example.Behavior.FlyNo;
import BehavioralDesignPattern.Strategy.Example.Behavior.QuackNo;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super("RubberDuck", new FlyNo(), new QuackNo());
    }
}

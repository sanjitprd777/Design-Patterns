package BehavioralDesignPattern.Strategy.Example.Duck;

import BehavioralDesignPattern.Strategy.Example.Behavior.FlyBehavior;
import BehavioralDesignPattern.Strategy.Example.Behavior.QuackBehavior;

public abstract class Duck {

    private final String name;

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("Duck " + name + " can swim");
    }

    public void display() {
        swim();
        flyBehavior.fly();
        quackBehavior.quack();
    }
}

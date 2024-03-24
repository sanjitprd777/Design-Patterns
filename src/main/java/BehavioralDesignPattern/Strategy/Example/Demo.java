package BehavioralDesignPattern.Strategy.Example;

import BehavioralDesignPattern.Strategy.Example.Behavior.FlyNo;
import BehavioralDesignPattern.Strategy.Example.Behavior.QuackNo;
import BehavioralDesignPattern.Strategy.Example.Duck.Duck;
import BehavioralDesignPattern.Strategy.Example.Duck.MallardDuck;
import BehavioralDesignPattern.Strategy.Example.Duck.RubberDuck;

public class Demo {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        System.out.println();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();

        System.out.println();
        System.out.println("Now we change fly and quack behavior dynamically");
        mallardDuck.setFlyBehavior(new FlyNo());
        mallardDuck.setQuackBehavior(new QuackNo());
        mallardDuck.display();
    }
}

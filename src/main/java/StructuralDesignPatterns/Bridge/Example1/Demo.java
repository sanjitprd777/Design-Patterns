package StructuralDesignPatterns.Bridge.Example1;

import StructuralDesignPatterns.Bridge.Example1.BreathingMethods.LandAnimals;
import StructuralDesignPatterns.Bridge.Example1.BreathingMethods.SeaAnimals;
import StructuralDesignPatterns.Bridge.Example1.BreathingMethods.Trees;
import StructuralDesignPatterns.Bridge.Example1.LivingOrganism.Dog;
import StructuralDesignPatterns.Bridge.Example1.LivingOrganism.Tree;
import StructuralDesignPatterns.Bridge.Example1.LivingOrganism.Whale;

public class Demo {

    public static void main(String[] args) {
        Dog dog = new Dog(new LandAnimals());
        dog.breatheMethod();

        Tree tree = new Tree(new Trees());
        tree.breatheMethod();

        Whale whale = new Whale(new SeaAnimals());
        whale.breatheMethod();
    }
}

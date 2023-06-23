package StructuralDesignPatterns.Bridge.Example1.LivingOrganism;

import StructuralDesignPatterns.Bridge.Example1.BreathingMethods.Breathe;

public class Dog extends Creature {

    public Dog(Breathe breathe) {
        super(breathe);
    }
}

package StructuralDesignPatterns.Bridge.Example1.LivingOrganism;

import StructuralDesignPatterns.Bridge.Example1.BreathingMethods.Breathe;

public abstract class Creature {

    Breathe breathe;

    public Creature(Breathe breathe) {
        this.breathe = breathe;
    }

    public void breatheMethod() {
        breathe.breatheType();
    }
}

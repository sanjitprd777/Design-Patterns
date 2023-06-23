package StructuralDesignPatterns.Bridge.Example1.LivingOrganism;

import StructuralDesignPatterns.Bridge.Example1.BreathingMethods.Breathe;

public class Whale extends Creature {

    public Whale(Breathe breathe) {
        super(breathe);
    }
}

package StructuralDesignPatterns.Bridge.Example1.LivingOrganism;

import StructuralDesignPatterns.Bridge.Example1.BreathingMethods.Breathe;

public class Tree extends Creature{

    public Tree(Breathe breathe) {
        super(breathe);
    }
}

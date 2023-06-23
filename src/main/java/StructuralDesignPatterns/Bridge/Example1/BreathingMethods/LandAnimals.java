package StructuralDesignPatterns.Bridge.Example1.BreathingMethods;

public class LandAnimals implements Breathe {
    @Override
    public void breatheType() {
        System.out.println("Breathing from Nose");
    }
}

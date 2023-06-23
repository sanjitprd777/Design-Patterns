package StructuralDesignPatterns.Bridge.Example1.BreathingMethods;

public class FlyAnimals implements Breathe {
    @Override
    public void breatheType() {
        System.out.println("Breathe vis nostrils");
    }
}

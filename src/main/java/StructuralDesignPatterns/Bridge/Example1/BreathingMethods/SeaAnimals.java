package StructuralDesignPatterns.Bridge.Example1.BreathingMethods;

public class SeaAnimals implements Breathe {
    @Override
    public void breatheType() {
        System.out.println("Breathing from gills");
    }
}

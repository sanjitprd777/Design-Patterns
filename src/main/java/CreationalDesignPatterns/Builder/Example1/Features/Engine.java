package CreationalDesignPatterns.Builder.Example1.Features;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public boolean isStarted() {
        return this.started;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        }
        else {
            System.out.println("You must start the engine first!");
        }
    }
}

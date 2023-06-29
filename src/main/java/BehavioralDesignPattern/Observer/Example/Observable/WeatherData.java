package BehavioralDesignPattern.Observer.Example.Observable;

import BehavioralDesignPattern.Observer.Example.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        System.out.println("Adding observer: " + o.toString());
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("Removing observer: " + o.toString());
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Something has changed...");
        if (observers.size() > 0) {
            System.out.println("Notifying everyone!");
            for (Observer o : observers) {
                o.update(temperature, humidity, pressure);
            }
        }
        else {
            System.out.println("No one to notify!");
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float newTemprature, float newHumidity, float newPressure) {
        this.temperature = newTemprature;
        this.humidity = newHumidity;
        this.pressure = newPressure;
        measurementChanged();
    }
}

package BehavioralDesignPattern.Observer.Example;

import BehavioralDesignPattern.Observer.Example.Observable.Subject;
import BehavioralDesignPattern.Observer.Example.Observable.WeatherData;
import BehavioralDesignPattern.Observer.Example.Observer.CurrentConditionsDisplay;
import BehavioralDesignPattern.Observer.Example.Observer.Observer;

public class Demo {

    public static void main(String[] args) {
        // Initialize Subject
        WeatherData weatherData = new WeatherData();

        // Add observers
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(1,1,1);
        System.out.println();
        weatherData.setMeasurements(10,10,10);

        System.out.println();
        System.out.println("Removing observer from list");
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(100,100,100);

    }
}

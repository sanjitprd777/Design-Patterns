package BehavioralDesignPattern.Observer.Example.Observer;

import BehavioralDesignPattern.Observer.Example.Observable.WeatherData;

public class WeatherForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private final WeatherData weatherData;

    public WeatherForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.temperature = -1;
    }

    @Override
    public void display() {
        System.out.println("Forecast Weather condition is:");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    @Override
    public void update() {
        if (this.temperature == -1) {
            this.temperature = weatherData.getTemperature();
            this.pressure= weatherData.getPressure();
            this.humidity = weatherData.getHumidity();
        }
        this.temperature = (float) ((this.temperature + weatherData.getTemperature())/2.0);
        this.pressure =  (float) ((this.pressure + weatherData.getPressure())/2.0);
        this.humidity = (float) ((this.humidity + weatherData.getHumidity())/2.0);
        display();
    }
}

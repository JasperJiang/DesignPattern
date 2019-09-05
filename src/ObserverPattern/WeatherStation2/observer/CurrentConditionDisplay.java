package ObserverPattern.WeatherStation2.observer;

import ObserverPattern.WeatherStation2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayBehavior{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        this.temperature =  weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}

package ObserverPattern.WeatherStation;

import ObserverPattern.WeatherStation.observer.CurrentConditionDisplay;
import ObserverPattern.WeatherStation.subject.WeatherData;

/**
 * 观察者模式 Observer Pattern
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        weatherData.registerObserver(currentConditionDisplay);

        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(4,5,6);

    }

}

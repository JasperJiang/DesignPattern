package ObserverPattern.WeatherStation2;

import ObserverPattern.WeatherStation2.observer.CurrentConditionDisplay;
import ObserverPattern.WeatherStation2.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        weatherData.addObserver(currentConditionDisplay);

        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(4,5,6);

    }

}

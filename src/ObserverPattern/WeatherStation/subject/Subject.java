package ObserverPattern.WeatherStation.subject;

import ObserverPattern.WeatherStation.observer.Observer;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();

}

package ObserverPattern.WeatherStation.observer;

public class CurrentConditionDisplay implements Observer, DisplayBehavior{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}

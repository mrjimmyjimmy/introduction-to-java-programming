package observer.cust;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jimmy xu
 * @date 2020/9/16 16:41
 */
public class WeatherData implements Subject {

    public static final WeatherData WEATHER_DATA = new WeatherData();

    private WeatherData() {
    }

    private List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 模拟数据更新
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

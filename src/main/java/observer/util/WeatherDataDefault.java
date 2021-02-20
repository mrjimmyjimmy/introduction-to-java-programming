package observer.util;

import java.util.Observable;

/**
 * @author jimmy xu
 * @date 2020/9/17 10:26
 */
public class WeatherDataDefault extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    public void measurementsChanged() {
        setChanged();
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

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }
}

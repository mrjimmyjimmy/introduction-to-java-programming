package observer.board;

import observer.cust.DisplayElement;
import observer.cust.Observer;
import observer.cust.Subject;

/**
 * @author jimmy xu
 * @date 2020/9/16 17:04
 */
public class Board implements Observer, DisplayElement {

    protected double temp;
    protected double humidity;
    protected double pressure;
    protected String name;

    public Board(Subject subject) {
        subject.register(this);
        this.name = "board";
    }

    @Override
    public void display() {
        System.out.println(String.format(" %s %s %s %s", name, temp, humidity, pressure));
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

package ch9;

import static java.lang.Math.*;

/**
 * @author jimmy xu
 * @date 2020/9/2 16:54
 */
public class Cycle {

    private double radius = 1;

    public Cycle() {

    }

    public Cycle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pow(radius, 2) * PI;
    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}

package ch9;

import static java.lang.Math.*;

/**
 * @author jimmy xu
 * @date 2020/9/2 16:54
 */
public class Cycle {

    double radius = 1;

    Cycle() {

    }

    Cycle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return pow(radius, 2) * PI;
    }

    double getPerimeter() {
        return 2 * radius * PI;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}

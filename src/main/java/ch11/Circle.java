package ch11;

/**
 * @author jimmy xu
 * @date 2021/5/19 15:14
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
}

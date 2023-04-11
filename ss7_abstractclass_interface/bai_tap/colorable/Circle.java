package ss7_abstractclass_interface.bai_tap.colorable;

public class Circle extends Shape implements IColorable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                "radius=" + radius + "Area: " + getArea() +
                '}';
    }

    @Override
    public String howToColor() {

        return null;
    }
}

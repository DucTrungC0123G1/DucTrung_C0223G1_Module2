package ss5_access_modifier_static.bai_tap.cricle;

public class Cricle {
    private double radius = 1.0;
    private String color = "Red";

    public Cricle() {
    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' + ", Dien Tich la: " + getArea() +
                '}';
    }
}

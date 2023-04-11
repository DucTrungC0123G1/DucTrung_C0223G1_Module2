package ss7_abstractclass_interface.bai_tap.colorable;

public class Rectangle extends Shape implements IColorable {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }


    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                "width=" + width +
                ", length=" + length + "Area: " + getArea() +
                '}';
    }

    @Override
    public String howToColor() {

        return null;
    }
}

package ss7_abstractclass_interface.bai_tap.resizeable;

public class Circle extends Shape implements IResizeable {
    private double radius;

    public Circle() {
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

    public double getPerimeter() {
        return 2 * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                "radius=" + radius +"Area= "+getArea()+ "Perimeter = "+ getPerimeter()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent/100;
        System.out.println("Area: "+ getArea());
    }
}

package ss7_abstractclass_interface.bai_tap.colorable;

public class Square extends Shape implements IColorable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() +
                "edge=" + edge + "Area: " + getArea() +
                '}';
    }

    @Override
    public String howToColor() {
        return getColor() + "" + "Color all four sides";

    }
}

package ss7_abstractclass_interface.bai_tap.resizeable;

public class Square extends Shape implements IResizeable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
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

    public double getPerimeter() {
        return this.edge * 4;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() +
                "edge=" + edge + "Area: " + getArea() + "Perimeter:" + getPerimeter() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.edge = this.edge * percent / 100;
        System.out.println("Area: " +getArea());

    }
}

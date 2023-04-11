package ss7_abstractclass_interface.bai_tap.colorable;

public class TestIColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 6);
        shapes[2] = new Square(6);
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                System.out.println(((Circle) s).howToColor());
            }
            if (s instanceof Square) {
                System.out.println(((Square) s).howToColor());
            }
            if (s instanceof Rectangle) {
                System.out.println(((Rectangle) s).howToColor());
            }
        }

    }
}


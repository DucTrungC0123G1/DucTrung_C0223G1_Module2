package ss7_abstractclass_interface.bai_tap.resizeable;

import java.util.Scanner;

public class TestIResizeable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", true, 5);
        shapes[1] = new Square(10);
        shapes[2] = new Rectangle(5, 5);
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }

        System.out.println("after change");
        for (Shape s : shapes) {
            s.resize(Math.random() * 100 + 1);
        }
//        for (Shape s : shapes) {
//            if (s instanceof Circle) {
//                System.out.println(((Circle) s).getArea());
//            }
//            if (s instanceof Square) {
//                System.out.println(((Square) s).getArea());
//            }
//            if (s instanceof Rectangle) {
//                System.out.println(((Rectangle) s).getArea());
//            }
//
//        }
    }
}

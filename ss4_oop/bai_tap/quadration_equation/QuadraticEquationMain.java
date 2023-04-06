package ss4_oop.bai_tap.quadration_equation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so A");
        double a = sc.nextDouble();
        System.out.println("Nhap so B");
        double b = sc.nextDouble();
        System.out.println("Nhap so C");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDelta() > 0) {
            System.out.println("PT co 2 nghiem la" + quadraticEquation.getRoot1() + " va " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("PT co 1 nghiem la : " + quadraticEquation.getRoot());
        } else {
            System.out.println("PT vo nghiem ");
        }

    }
}

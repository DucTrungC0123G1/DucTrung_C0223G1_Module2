package ss4_oop.thuc_hanh;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Width");
        int width = sc.nextInt();
        System.out.println("Height");
        int height = sc.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("Dien tich"+rectangle.getArea());
        System.out.println("chu vi"+ rectangle.getPerimeter());


    }


}

package ss15_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) throws TriangleException {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        CheckTriangle check = new CheckTriangle();
        try {
            System.out.println("Nhap canh a");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh b");
            b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh c");
            c = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Canh tam giac khong duoc nhap chu");
            System.out.println(e.getMessage());
        }
        try {
            check.checkEdge(a, b, c);
        } catch (TriangleException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println("Nhap sai");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done!");
        }
    }
}

package ss6_inhertitance.bai_tap.crilce_cylinder;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = new Cylinder(5,"Blue",5);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}

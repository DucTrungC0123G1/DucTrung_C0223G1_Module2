package ss5_access_modifier_static.bai_tap.cricle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        Cricle cricle = new Cricle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban kinh truoc khi thay doi la: " + cricle.getRadius());
        System.out.println("mau la : " + cricle.getColor());
        System.out.println("Nhap ban kinh muon thay doi:");
        double newRadius = sc.nextDouble();
        System.out.println("Nhap mau muon thay doi:");
        String temp = sc.nextLine();
        String newColor = sc.nextLine();
        Cricle newCricle = new Cricle(newRadius, newColor);
        System.out.println(newCricle);

    }
}

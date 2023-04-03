package ss1_introduction_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten:");
        String name = sc.nextLine();
        System.out.println("Hello" + name);
    }
}

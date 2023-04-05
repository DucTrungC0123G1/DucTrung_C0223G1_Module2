package ss3_Method_Java.bai_tap;

import java.util.Scanner;

public class CheckOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so");
        int num = Integer.parseInt(sc.nextLine());
        CheckOdd.isOdd(num);
        System.out.println(CheckOdd.isOdd(num));
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return true;
        }
            return false;
    }
}

package ss3_method_java.bai_tap;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so");
        int num = Integer.parseInt(sc.nextLine());
        CheckPrime.isPrime(num);
        System.out.println(CheckPrime.isPrime(num));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

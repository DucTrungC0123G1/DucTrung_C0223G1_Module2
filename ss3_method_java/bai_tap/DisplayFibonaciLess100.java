package ss3_method_java.bai_tap;

import java.util.Scanner;

public class DisplayFibonaciLess100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong Fibonacci");
        int count = Integer.parseInt(sc.nextLine());
        DisplayFibonaciLess100.isFibonacci(count);
    }

    public static int isFibonacci(int count) {
        int num1 = 0;
        int num2 = 1;
        int sum = 1;

        for (int i = 0; i < count; i++) {
            System.out.println(num1 + " ");
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
        }
        return sum;
    }
}







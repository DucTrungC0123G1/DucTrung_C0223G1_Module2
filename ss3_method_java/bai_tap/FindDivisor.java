package ss3_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so ");
        int num = Integer.parseInt(sc.nextLine());
        FindDivisor.isDivisor(num);
        System.out.println(Arrays.toString(FindDivisor.isDivisor(num)));
    }

    public static int[] isDivisor(int num) {
        int divisor = 0;
        int count = 0;
        int[] arr = new int[num/2];
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisor = i;
                count++;
                arr[count] = divisor;
            }
        }
        return arr;

    }
}

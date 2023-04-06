package ss2_array_loop.bai_tap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int n = 0;
        while (n < 20) {
            for (int i = 2; i < 200; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    n++;
                    System.out.println(+i);
                }
                if (n == 20) {
                    break;
                }

            }

        }

    }
}

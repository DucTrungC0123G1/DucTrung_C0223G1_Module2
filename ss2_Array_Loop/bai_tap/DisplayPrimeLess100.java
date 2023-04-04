package ss2_Array_Loop.bai_tap;

import java.util.Scanner;

public class DisplayPrimeLess100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int n = 0;
        for (int i = 2; i < 1000; i++) {
            count = 0;
            if (i > 100) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(+i);
            }

        }
    }
}

package ss2_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Nhap phan tu N");
        int count = 0;
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            } else {
                count++;
            }
        }
        if (count == array.length) {
            System.out.println("N ko co trong mảng");
        }
        System.out.println(Arrays.toString(array));
    }
}


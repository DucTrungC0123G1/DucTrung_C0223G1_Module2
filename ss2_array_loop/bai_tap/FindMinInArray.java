package ss2_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu" + (i + 1) + ":");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("gia tri nho nhat cua mang la: " + min);


    }
}

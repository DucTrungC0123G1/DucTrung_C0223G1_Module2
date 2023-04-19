package ss14_sort.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SettingSort extends IllustrationSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Nhap do dai mang");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu i " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("Mang truoc khi sap xep" + Arrays.toString(array));
        insertSort(array);
        System.out.println("Sau khi sap xep la" + Arrays.toString(array));
    }
}

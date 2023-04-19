package ss14_sort.bai_tap;

import java.util.Arrays;

public class IllustrationSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 9, 7, 1, 3, 8, 10};
        insertSort(arr);
        System.out.println("mang sau khi sap xep" + Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
                System.out.println("- lan thu i" + i + Arrays.toString(arr) + "\ndi chuyen phan tu " + arr[pos]);
            }
            if (pos != i) {
                System.out.println("chen phan tu " + x + " tai vi tri " + arr[pos]);
                arr[pos] = x;
            }
            System.out.println("+ lan thu i" + i + Arrays.toString(arr));
        }
    }
}

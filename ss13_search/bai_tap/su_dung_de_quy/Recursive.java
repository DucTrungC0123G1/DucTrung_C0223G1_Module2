package ss13_search.bai_tap.su_dung_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu I " + i);
            arr[i] = Integer.parseInt(sc.nextLine());

        }
        Arrays.sort(arr);
        System.out.println("\n Da sap xep");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println("\n Chon ptu muon tim ");
        int chose = Integer.parseInt(sc.nextLine());
        System.out.println("\n Vi tri index la ");
        System.out.println(binarySearch(arr, 0, arr.length - 1, chose));
    }

    public static int binarySearch(int[] array, int min, int max, int value) {
        if (max >= min) {
            int mid = (min + max) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (value > array[mid]) {
                return binarySearch(array, mid + 1, max, value);
            }
            return binarySearch(array, min, mid - 1, value);
        }
        return -1;
    }

}

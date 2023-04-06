package ss2_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang A");
        int sizeA = Integer.parseInt(sc.nextLine());
        int[] arrayA = new int[sizeA];
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Nhap phan tu thu" + (i + 1) + ":");
            arrayA[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arrayA));
        System.out.println("Nhap do dai mang B");
        int sizeB = Integer.parseInt(sc.nextLine());
        int[] arrayB = new int[sizeB];
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Nhap phan tu thu" + (i + 1) + ":");
            arrayB[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arrayB));
        int[] arrayC = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            arrayC[arrayA.length + i] = arrayB[i];
        }
        System.out.println(Arrays.toString(arrayC));

    }
}

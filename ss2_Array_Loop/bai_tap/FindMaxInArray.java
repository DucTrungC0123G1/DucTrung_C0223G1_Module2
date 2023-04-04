package ss2_Array_Loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai hang");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap do dai cot");
        int m = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][m];
        int max = 0;
        System.out.println("Nhap phan tu cua mang");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("So lon nhat trong mang la :" + max);
    }
}

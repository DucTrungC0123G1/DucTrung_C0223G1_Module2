package ss2_array_loop.bai_tap;

import java.util.Scanner;

public class SumArrayColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so cot");
        int m = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][m];
        System.out.println("Nhap phan tu trong mang");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Nhap cot can tinh");
        int col = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int[] ints : arr) {
            sum += ints[col];
        }
        System.out.println("Tong cot thu " + col + " la " + sum);
    }
}

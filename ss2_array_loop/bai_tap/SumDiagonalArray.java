package ss2_array_loop.bai_tap;

import java.util.Scanner;

public class SumDiagonalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai hang");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap do dai cot");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        System.out.println("Nhap phan tu trong mang");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum1 += arr[i][j];

                }
            }
        }
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == (arr.length - 1) - i) {
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("Tong 2 duong cheo la :" + (sum1 + sum2));

    }
}

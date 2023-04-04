package ss2_Array_Loop.bai_tap;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CountElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        String str1 = sc.nextLine();
        String[] arr = str1.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap ki tu");
        String character = sc.nextLine();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], character)) {
                count++;
            }
        }
        System.out.println("Co " + count + " ki tu " + character + " trong chuoi");

    }
}

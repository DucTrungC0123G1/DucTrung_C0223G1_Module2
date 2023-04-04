package ss2_Array_Loop.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        System.out.println("Nhap So Can Them");
        int numb = Integer.parseInt(sc.nextLine());
        System.out.println("Vi tri can them");
        int index = Integer.parseInt(sc.nextLine());
//        int[] newArr = new int[arr.length + 1];
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Khong chen duoc");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    for (int j = arr.length - 1; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[index] = numb;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

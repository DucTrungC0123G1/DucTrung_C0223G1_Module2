package ss3_Method_Java.bai_tap;

import java.util.Scanner;

public class FindLeepYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nam");
        int year = Integer.parseInt(sc.nextLine());
        FindLeepYear.isLeep(year);
        System.out.println(FindLeepYear.isLeep(year));
    }

    public static boolean isLeep(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}

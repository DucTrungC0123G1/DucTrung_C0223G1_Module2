package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("Nhap so tien USD can doi: ");
        double usd = Double.parseDouble(sc.nextLine());
        double quyDoi = usd * vnd;
        System.out.println("So Tien Chuyen Doi La: " + quyDoi);

    }

}

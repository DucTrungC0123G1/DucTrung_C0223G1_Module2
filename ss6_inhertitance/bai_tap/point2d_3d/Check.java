package ss6_inhertitance.bai_tap.point2d_3d;

import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point3d point3d = new Point3d(3, 5, 8);
        System.out.println(point3d);
        System.out.println(Arrays.toString(point3d.getXYZ()));

    }
}

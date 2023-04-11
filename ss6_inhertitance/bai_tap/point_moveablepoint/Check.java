package ss6_inhertitance.bai_tap.point_moveablepoint;

import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovablePoint movablePoint = new MovablePoint(2, 4, 2, 5);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());

    }
}

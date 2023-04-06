package ss4_oop.bai_tap.fan;

import java.util.Scanner;

public class FanMain {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        fan.setColor("Red");
        fan.setSpeed(fan.FAST);
        fan.setRadius(10);
        Fan fan1 = new Fan();
        fan1.setOn(false);
        fan1.setColor("Green");
        fan1.setSpeed(fan.FAST);
        fan1.setRadius(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 to Fan ON: ");
        int turnOn = Integer.parseInt(sc.nextLine());
        if (turnOn == 0) {
            System.out.println(fan);
        }
        System.out.println("Press 1 to Fan OFF: ");
        int turnOff = Integer.parseInt(sc.nextLine());
        if (turnOff == 1) {
            System.out.println(fan1);
        }

    }
}

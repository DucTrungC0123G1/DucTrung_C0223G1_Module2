package mvc_2.service;

import java.util.Scanner;
//Staff(String id, String name, boolean gender, String dayOfBirth)
public class StaffService implements IStaffService {
    Scanner sc = new Scanner(System.in);
    @Override
    public void addStaff() {
        System.out.println("Nhap Vao ID Staff");
        String id = sc.nextLine();
        System.out.println("Nhap Vao Ten");
        String name = sc.nextLine();
        System.out.println("Nhap Vao Gioi Tinh");
        Boolean gender = sc.nextLine();
        System.out.println("Nhap Vao Nam Sinh");
        String birthDay = sc.nextLine();

    }
}

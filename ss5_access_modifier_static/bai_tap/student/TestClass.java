package ss5_access_modifier_static.bai_tap.student;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Tên chưa sửa là :" + student.getName());
        System.out.println("Lớp chưa sửa là :" + student.getClasses());
        System.out.println("Sửa lại tên: ");
        String newName = sc.nextLine();
        System.out.println("Sửa lại lớp: ");
        String newClasses = sc.nextLine();
        Student newstudent = new Student(newName, newClasses);
        System.out.println(newstudent);
    }
}

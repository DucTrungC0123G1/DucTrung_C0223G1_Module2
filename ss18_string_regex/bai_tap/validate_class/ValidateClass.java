package ss18_string_regex.bai_tap.validate_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static String CLASSNAME = "^[C,A,P][0-9]{4}[G,H,I,K]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten Lop");
        String input = sc.nextLine();
        Pattern pattern1 = Pattern.compile(CLASSNAME);
        Matcher matcher1 = pattern1.matcher(input);
        if (matcher1.matches()) {
            System.out.println(matcher1.matches());
            System.out.println("Ten Lop Dung");
        } else {
            System.out.println("Nhap Sai Ten Lop, Xin Nhap Lai");
        }
    }
}

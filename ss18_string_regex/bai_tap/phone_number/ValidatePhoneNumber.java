package ss18_string_regex.bai_tap.phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;

    private static String REGEX_PHONE_NUMBER = "^\\d{2}[0]\\d{9}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vao SDT (xx)-(0xxxxxxxxx)");
        String input = sc.nextLine();
        Pattern pattern1 = Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher matcher1 = pattern1.matcher(input);
        if (matcher1.matches()) {
            System.out.println("Ban Nhap Dung SDT");
        } else {
            System.out.println("Ban Nhap Sai SDT, Xin Nhap Lai");
        }
    }
}

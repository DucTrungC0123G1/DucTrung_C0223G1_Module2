package ss13_search.bai_tap.find_long_string;

import java.util.LinkedList;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (linkedList.size() > 1 && str.charAt(i) <= linkedList.getLast()) {
                linkedList.contains(str.charAt(i));
                linkedList.clear();
            }
            linkedList.add(str.charAt(i));
            if (linkedList.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(linkedList);
            }
        }
        for (Character ch : listMax) {
            System.out.println(ch);
        }
        System.out.println();
    }
}

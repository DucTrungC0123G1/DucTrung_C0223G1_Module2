package ss13_search.bai_tap.ascending;

import java.util.LinkedList;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        String str = sc.nextLine();
        LinkedList<Character> arrMax = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()> arrMax.size()){
                arrMax.clear();
                arrMax.addAll(list);
            }
            list.clear();
        }
        for (Character c: arrMax){
            System.out.println(c);
        }

    }

}

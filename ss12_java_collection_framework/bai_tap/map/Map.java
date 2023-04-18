package ss12_java_collection_framework.bai_tap.map;

import java.util.Scanner;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<>();
        System.out.println("nhập vô 1 chuỗi");
        String input = sc.nextLine().toLowerCase();
        String[] arr = input.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            map.put(arr[i], count);
            count = 0;
        }
        System.out.println(map);
    }
}

package ss10_dsa_arraylist.bai_tap.array_list;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(6);
        System.out.println(listInteger);
        System.out.println("element 4:" + listInteger.get(4));
        listInteger.remove(4);
        System.out.println(listInteger);
        System.out.println("element 2:" + listInteger.get(2));
        listInteger.remove(2);
        System.out.println(listInteger);
    }
}

package ss10_dsa_stack_queue.bai_tap.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String str1 = str.toLowerCase();
        String[] arr = str1.split("");
        int n = arr.length;
        boolean result = true;
        System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            stack.push(s);
            queue.offer(s);
        }
        System.out.println(stack);
        System.out.println(queue);
        for (int i = 0; i < n; i++) {
            if (!stack.pop().equals(queue.remove())) {
                result = false;
            }
        }
        if (result) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not - Palindrome");
        }


    }
}



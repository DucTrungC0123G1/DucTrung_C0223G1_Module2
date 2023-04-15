package ss10_dsa_stack_queue.bai_tap.check_bracket;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kiểm tra ()");
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        String[] arr = str.split("");
        int n= arr.length;
        boolean flag = false;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <n; i++) {
            if (arr[i].equals("(")){
                stack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                stack.push(arr[i]);

            }
        }
        System.out.println(stack);
        if (stack.size()%2==0){
            flag = true;

        }
        if (flag){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}

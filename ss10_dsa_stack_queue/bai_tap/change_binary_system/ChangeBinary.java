package ss10_dsa_stack_queue.bai_tap.change_binary_system;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ChangeBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so can chuyen");
        int numb = scanner.nextInt();
        int count = 0;
        while (numb != 0) {
            int a = numb % 2;
            stack.push(a);
            count++;
            numb = numb / 2;
        }
        System.out.println(stack);
        System.out.println(count);
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}

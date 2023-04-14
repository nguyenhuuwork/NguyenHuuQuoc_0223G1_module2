package ss11_dsa_stack_queue.exersice.convert_binary_to_decimal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number transfer to binary");
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            int result = number % 2;
            stack1.push(result);
            number = number / 2;
            count++;
        }
        System.out.println(stack1);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack1.pop();
        }
        System.out.println("Binary transfer to decimal");
        System.out.println(Arrays.toString(array));
    }
}

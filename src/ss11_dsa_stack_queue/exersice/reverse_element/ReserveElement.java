package ss11_dsa_stack_queue.exersice.reverse_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReserveElement {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Input the number of elements to array ");
        a = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input element:" + i);
            array[i] = sc.nextInt();
            stack1.push(array[i]);
        }
        System.out.println("Array");
        System.out.println(Arrays.toString(array));
        System.out.println("Stack");
        System.out.println(stack1);
        for (int i = 0; i < array.length; i++) {
            array[i] = stack1.pop();
        }
        System.out.println("Stack after transfer");
        System.out.println(Arrays.toString(array));
    }
}

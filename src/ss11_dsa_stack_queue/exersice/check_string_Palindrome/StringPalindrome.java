package ss11_dsa_stack_queue.exersice.check_string_Palindrome;

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        String para = "Able was I ere I saw Elba";
        String a = para.toLowerCase();
        System.out.println(a);
        String[] array = a.split("");
        System.out.println(Arrays.toString(array));
        Stack<String> stack1 = new Stack<>();
        Queue<String> queue1 = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            stack1.push(array[i]);
            queue1.offer(array[i]);
        }
        System.out.println("Stack" + stack1);
        System.out.println("Queue" + queue1);
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (!stack1.pop().equals(queue1.remove())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("String Palindrome");
        } else {
            System.out.println("It's not");
        }
    }
}

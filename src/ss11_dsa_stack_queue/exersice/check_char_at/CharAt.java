package ss11_dsa_stack_queue.exersice.check_char_at;

import java.util.Stack;

public class CharAt {
    public static void main(String[] args) {
        String str = "a*(b-c(s+b))";
        System.out.println(str);
        checkBracket(str);
    }

    public static void checkBracket(String str) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        String[] strings = str.split("");
        boolean flag = true;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("(")) ;
            {
                stack1.push(strings[i]);
            }
            if (strings[i].equals("(")) ;
            {
                stack2.push(strings[i]);
            }
            if (stack1.size() < stack2.size()) {
                flag = true;
                break;
            }
        }
        if (flag && stack1.size() == stack2.size()) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}

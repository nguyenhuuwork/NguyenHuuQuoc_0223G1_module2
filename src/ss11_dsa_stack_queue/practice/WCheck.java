package ss11_dsa_stack_queue.practice;

import java.util.Scanner;
import java.util.Stack;

public class WCheck {
    //    Ý tưởng giải quyết vấn đề:
//
//            1. Khởi tạo một Stack rỗng, có kiểu số.
//
    //
//2. Với n phần tử của mảng, lần lượt đưa vào Stack thông qua hàm Push: Push a[i] into Stack.
//
//            3. Lần lượt lấy ra từ Stack n phần tử và đưa vào trở lại mảng ban đầu:
//
//            4. Kết thúc giải thuật.
    public static void main(String[] args) throws Exception {
        ImplementStack stack = new ImplementStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1.Size of stack after push operations: " + stack.size());
        System.out.println(stack.toString());
        System.out.println("2 Pop elements from stack");
//        for (int i = stack.size() - 1; i >= 0; i--) {
//
//        }
    }
}

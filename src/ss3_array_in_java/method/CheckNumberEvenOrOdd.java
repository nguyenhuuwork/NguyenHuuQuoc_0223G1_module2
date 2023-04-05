package ss3_array_in_java.method;

import java.util.Scanner;

public class CheckNumberEvenOrOdd {
    public static boolean checkEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int checkNumber = sc.nextInt();
//        Goi ham
        System.out.println(checkEven(checkNumber));
    }
}

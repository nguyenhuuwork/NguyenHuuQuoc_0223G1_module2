package ss3_array_in_java.method;

import java.util.Scanner;

public class CheckYearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number is check");
        int number = sc.nextInt();
        System.out.println(checkYear(number));
    }
    public static boolean checkYear(int number){
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            System.out.println("This is leap year " + number);
            return true;
        }
        return false;
    }

}



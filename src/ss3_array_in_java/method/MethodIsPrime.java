package ss3_array_in_java.method;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MethodIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        checkNumber(number);
        System.out.println(checkNumber(number));
    }
    public static boolean checkNumber(int isPrime) {
        if (isPrime < 2) {
            return false;
        }
        for (int i = 2; i < isPrime; i++) {
            if (isPrime % i != 0) {
                return true;
            }
        }
        return false;
    }
}

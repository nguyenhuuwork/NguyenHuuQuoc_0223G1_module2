package ss3_array_in_java.method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodIsPrimeAndReturnElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
//        addElementToArray(number);
        System.out.println(Arrays.toString(addElementToArray(number)));
    }

    public static int[] addElementToArray(int number) {
        int[] array = new int[number];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }

}

package ss3_array_in_java.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 element to array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Smallest value is " + min);
        System.out.println(index);
    }
}

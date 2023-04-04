package ss3_array_in_java.exersice;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] arrr = new int[5];
        int[] arrayA = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 element to array");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrayA));
        int number;
        int index = -1;
        System.out.println("Enter number");
        number = sc.nextInt();
        for (int j = 0; j < arrayA.length; j++) {
            if (number == arrayA[j]) {
                index = j;
            }
        }
        System.out.println("Element belong array");
        for (int i = index; i < arrayA.length; i++) {
            if (i < arrayA.length - 1) {
                arrayA[i] = arrayA[i + 1];
            } else {
                arrayA[arrayA.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayA));
    }
}

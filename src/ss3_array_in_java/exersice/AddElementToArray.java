package ss3_array_in_java.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
//        int[] arrayA = new int[10];
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number add to array");
//        for (int i = 0; i < arrayA.length; i++) {
//            arrayA[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arrayA));
        int[] arrayA = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Enter index to insert");
        int index = sc.nextInt();
//        [3]
        System.out.println("Enter element to insert");
        int number = sc.nextInt();
//        4
        if (index <= -1 && index >= arrayA.length - 1) {
            System.out.println("No insert");
        } else {
            for (int i = arrayA.length - 1; i > index; i--) {
                arrayA[i] = arrayA[i - 1];
            }
            arrayA[index] = number;
        }
        System.out.println(Arrays.toString(arrayA));
    }
}

package ss3_array_in_java.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to arrayA");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }
        System.out.println("Enter element to arrayB");
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = sc.nextInt();
        }
        int[] arrayC = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
        }
        System.out.println(Arrays.toString(arrayC));
        for (int i = 0; i < arrayB.length; i++) {
            arrayC[arrayB.length + i] = arrayB[i];
        }
        System.out.println(Arrays.toString(arrayC));
    }
}

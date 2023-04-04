package ss3_array_in_java.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class TotalElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, colum;
        System.out.println("Enter row array");
        row = sc.nextInt();
        System.out.println("Enter colum array");
        colum = sc.nextInt();
        System.out.println("Enter element array");
        int sum = 0;
        int array[][] = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter element [" + i + "," + j + "]");
                array[i][j] = sc.nextInt();
            }
            sum += array[i][0];
        }
        System.out.println("Sum of elements in colum " + sum);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
    }
}

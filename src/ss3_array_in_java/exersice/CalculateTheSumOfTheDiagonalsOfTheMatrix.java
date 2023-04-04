package ss3_array_in_java.exersice;

public class CalculateTheSumOfTheDiagonalsOfTheMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };
        int sum;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    sum1 += array[i][j];
                }
            }
        }
        System.out.println(sum1);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) == array.length - 1) {
                    sum2 += array[i][j];
                }
            }
        }
        System.out.println(sum2);
        sum = sum1 + sum2;
        System.out.println("Total 2 diagonal " + sum);
    }
}

package ss13_search_algorithmn.exersice.sreach_algorithmn;

import java.util.Arrays;

public class SreachAlgorithmn {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of element for array");
//        int input = sc.nextInt();
//        int[] array = new int[input];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter element number " + i);
//            array[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(array));

        int[] array = new int[]{1, 3, 2, 6, 5, 4};
        int flag = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    flag = array[j];
                    array[j] = array[i];
                    array[i] = flag;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                return binarySearch(array, value, middle + 1, right);
            }
            return binarySearch(array, value, left, middle - 1);
        }
        return -1;
    }

    SreachAlgorithmn s = new SreachAlgorithmn();
}

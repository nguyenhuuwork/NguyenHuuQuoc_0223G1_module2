package ss14_arrange_algorithmn.exersice;

import java.util.Arrays;

public class SetUpInsertAlgorithmn {
    public static void main(String[] args) {
        int[] array = new int[]{12, 13, 11, 5, 6};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Phần tử màu đỏ
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key; // Đưa phần tử màu đỏ vào vị trí phù hợp
        }
    }
}

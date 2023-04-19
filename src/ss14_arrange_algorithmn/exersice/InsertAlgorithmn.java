package ss14_arrange_algorithmn.exersice;

import java.util.Arrays;

public class InsertAlgorithmn {
    public static void main(String[] args) {
        int[] array = new int[]{12, 11, 13, 5, 6};
        int flag = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    flag = array[j];
                    array[j] = array[i];
                    array[i] = flag;
                }
            }
            System.out.println("Vòng lặp thứ: " + i + Arrays.toString(array));
        }
        System.out.println("Mảng đã được sắp xếp: " + Arrays.toString(array));

    }
//    public static void insertSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i]; // Phần tử màu đỏ
//            int j;
//            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
//                arr[j + 1] = arr[j];
//            }
//            arr[j + 1] = key; // Đưa phần tử màu đỏ vào vị trí phù hợp
//        }
//    }
}

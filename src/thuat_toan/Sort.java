package thuat_toan;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                list.add(a[i]);
            }
        }
        list.sort(((o1, o2) -> o1 - o2));
        System.out.println(list);
        int count = 0;
        for (
                int i = 0;
                i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(count);
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

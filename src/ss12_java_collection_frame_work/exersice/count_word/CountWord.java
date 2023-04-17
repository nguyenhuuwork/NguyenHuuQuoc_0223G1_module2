package ss12_java_collection_frame_work.exersice.count_word;

import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Nine five six five three six Nine two one";
        String[] array = new String[str.length()];
        array = str.toLowerCase(Locale.ROOT).split(" ");
        Map<String, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map1.containsKey(array[i])) {
                map1.put(array[i], map1.get(array[i]) + 1);
            } else {
                map1.put(array[i], 1);
            }
        }
        Set<String> setString = map1.keySet();
        for (String a : setString) {
            System.out.println(a + " Number of appear " + map1.get(a));
        }
    }
}

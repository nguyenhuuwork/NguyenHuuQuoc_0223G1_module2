package ss2_loop_in_java.exersice;

public class DisplayIsPrimeless100 {
    public static void main(String[] args) {
//        int count = 0;
        for (int i = 2; i > 1; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % 2 == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && i < 100) {
                System.out.println(i);
            }
        }
    }
}


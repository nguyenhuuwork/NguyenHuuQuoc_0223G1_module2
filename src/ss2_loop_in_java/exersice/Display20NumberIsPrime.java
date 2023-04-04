package ss2_loop_in_java.exersice;

public class Display20NumberIsPrime {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 2; i > 1; i++) {
//            boolean flag = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.println(i);
//                count++;
//            }
//            if (count == 20) {
//                break;
//            }
//        }
        int count = 0;
        for (int i = 2; i > 1; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
            if (count==20){
                break;
            }
        }
    }
}


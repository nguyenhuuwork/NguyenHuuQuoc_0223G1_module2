package ss2_loop_in_java.exersice;

public class DisplayCubes {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("-----");
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----");
        for (int n = 0; n < 5; n++) {
            for (int m = 5; m > n; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

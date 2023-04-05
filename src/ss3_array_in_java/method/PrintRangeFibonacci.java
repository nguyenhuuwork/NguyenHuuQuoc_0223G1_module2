package ss3_array_in_java.method;

public class PrintRangeFibonacci {
    public static void main(String[] args) {
        print(100);
    }
    public static int print(int number) {
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 100; i++) {
            sum = a + b;
            a = b;
            b = sum;
            if (sum < 100) {
                System.out.println(sum);
            } else {
                break;
            }
        }
        return number;
    }
}

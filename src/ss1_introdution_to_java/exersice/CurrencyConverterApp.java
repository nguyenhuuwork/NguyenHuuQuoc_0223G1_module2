package ss1_introdution_to_java.exersice;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        int vnd;
        int rate1 = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        vnd = Integer.parseInt(sc.nextLine());
        System.out.println("USD money transfer VND:" + rate1 * vnd);
    }
}

package ss1_introdution_to_java.exersice;

import java.util.Scanner;

public class AppToReadNumberIntoLetter {
    public static String underTen(int number) {
        String s = "";
        switch (number) {
            case 1: {
                s = "one";
                break;
            }
            case 2: {
                s = "two";
                break;
            }
            case 3: {
                s = "three";
                break;
            }
            case 4: {
                s = "four";
                break;
            }
            case 5: {
                s = "five";
                break;
            }
            case 6: {
                s = "six";
                break;
            }
            case 7: {
                s = "seven";
                break;
            }
            case 8: {
                s = "eight";
                break;
            }
            case 9: {
                s = "nine";
                break;
            }
            case 10: {
                s = "ten";
                break;
            }
        }
        return s;
    }

    public static int under20(int number) {
        if (number < 20) {
            System.out.println(underTen(number % 10) + "teen");
        } else if (number == 11) {
            System.out.println("eleven");
        } else if (number == 12) {
            System.out.println("twelve");
        } else if (number == 13) {
            System.out.println("thirteen");
        }
        return number;
    }

    public static int under100(int number) {
        if (number % 10 == 0) {
            System.out.println(underTen(number / 10) + "ty");
        } else {
            System.out.println(underTen(number / 10) + "ty" + underTen(number % 10));
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so de chuyen doi thanh chu");
        int number = sc.nextInt();

        if (number <= 10) {
            underTen(number);
        } else if (number < 20) {
            under20(number);
        } else if (number < 100) {
            under100(number);
        }
    }
}

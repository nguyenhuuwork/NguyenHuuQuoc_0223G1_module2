package ss3_array_in_java.exersice;

import java.util.Scanner;

public class CountHowManyCharInString {
    public static void main(String[] args) {
        String string = "nguyen huu quoc";
        char character = 'u';
        int count = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter character to char");
//        character =
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

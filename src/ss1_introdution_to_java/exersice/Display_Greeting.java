package ss1_introdution_to_java.exersice;

import java.util.Scanner;

public class Display_Greeting {
    public static void main(String[] args) {
        String name = "";
        Scanner nhapVao = new Scanner(System.in);
        System.out.println("Enter a name");
        name = nhapVao.nextLine();
        System.out.println("Hello: " + name);
    }
}

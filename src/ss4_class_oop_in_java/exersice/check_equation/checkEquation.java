package ss4_class_oop_in_java.exersice.check_equation;

import java.util.Scanner;

public class checkEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        double a = sc.nextDouble();
        System.out.println("Enter number b");
        double b = sc.nextDouble();
        System.out.println("Enter number c");
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() < 0) {
            System.out.println("Equation is solution");
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("Equation is one test: " + qe.getRoot1());
        } else {
            System.out.println("Equation is  2 test different: " + qe.getRoot1() + qe.getRoot2());
        }
    }
}

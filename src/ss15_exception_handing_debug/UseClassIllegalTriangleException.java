package ss15_exception_handing_debug;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseClassIllegalTriangleException {
    public static void triangle(int a, int b, int c) throws TriangleEdgeException {
        if (a <= 0 && b <= 0 && c <= 0) {
            throw new TriangleEdgeException("Edges must be greater than 0");
        } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new TriangleEdgeException("Total 2 edges must be longer than another egde");
        } else {
            System.out.println("Input right");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter edge a");
            int a = sc.nextInt();
            System.out.println("Enter edge b");
            int b = sc.nextInt();
            System.out.println("Enter edge c");
            int c = sc.nextInt();
            triangle(a, b, c);
        } catch (TriangleEdgeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException r) {
            System.err.println("Error: You have input number");
        } finally {
            System.out.println("End program");
        }
    }
}


package debug_triangle_again;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseException {
    public static void triangle(int a, int b, int c) throws CheckException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new CheckException("Tat ca cac canh phai lon hon 0");
        } else if ((a + b) > c || (a + c) > b || (b + c) > a) {
            throw new CheckException("Tam giac phai co 2 canh lon hon 2 canh con lai");
        } else {
            System.out.println("Tam giac du dieu kien");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap so a");
            int a = sc.nextInt();
            System.out.println("Nhap so b");
            int b = sc.nextInt();
            System.out.println("Nhap c");
            int c = sc.nextInt();
            triangle(a, b, c);
        } catch (CheckException e) {
            System.out.println("Eror: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Ket thuc chuong trinh check");
        }
    }
}

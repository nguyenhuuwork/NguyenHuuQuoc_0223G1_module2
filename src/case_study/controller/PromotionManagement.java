package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    public void promotionManagement() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----PromotionManagement-----\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customer get voucher\n" +
                    "3. Return employee\n" +
                    "");
            int inputOption5 = 0;
            try {
                System.out.println("Choose option promotion management");
                inputOption5 = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Must enter number");
            }
            switch (inputOption5) {
                case 1:
                    /// display list employee
                    break;
                case 2:
                    //// add new employee
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Retype menu");
            }
        } while (flag);
    }
}

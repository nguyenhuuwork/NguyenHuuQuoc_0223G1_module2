package case_study.controller;

import java.util.Scanner;

public class BookingManagement {
    public void bookingManagementController() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----BookingManagement-----\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list contract\n" +
                    "5. Edit constact\n" +
                    "6.");
            int inputOption1 = 0;
            try {
                System.out.println("Choose option employee management");
                inputOption1 = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Must enter number");
            }
            switch (inputOption1) {
                case 1:
                    /// display list employee
                    break;
                case 2:
                    //// add new employee
                    break;
                case 3:
                    /// edit employee;
                    break;
                case 4:
                    ///
                    break;
                case 5:
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Retype menu");
            }
        } while (flag);
    }
}

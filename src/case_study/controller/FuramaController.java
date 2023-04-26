package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    EmployeeManagement employeeManagement = new EmployeeManagement();
    BookingManagement bookingManagement = new BookingManagement();
    CustomerManagement customerManagement = new CustomerManagement();
    FacilityManagement facilityManagement = new FacilityManagement();
    PromotionManagement promotionManagement = new PromotionManagement();
    static Scanner sc = new Scanner(System.in);

    public void displayMenuMain() {
        boolean flag = true;
        do {
            System.out.println("---------FURAMA RESORT MANAGEMENT----------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "");
            int inputOption = 0;
            try {
                System.out.println("Please choose function");
                inputOption = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Must enter number");
            }
            switch (inputOption) {
                case 1:
                    employeeManagement.employeeManagementMenu();
                    break;
                case 2:
                    customerManagement.customerManagementCotroller();
                    break;
                case 3:
                    facilityManagement.facilityManagementController();
                    break;
                case 4:
                    bookingManagement.bookingManagementController();
                    break;
                case 5:
                    promotionManagement.promotionManagement();
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

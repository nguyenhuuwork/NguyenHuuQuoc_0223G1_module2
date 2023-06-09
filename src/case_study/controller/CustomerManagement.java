package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    CustomerService customerService = new CustomerService();

    public void customerManagementCotroller() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("---------CustomerManagement--------\n" +
                    "1. Display list Customer\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n" +
                    "");
            int inputOpiton2 = 0;
            try {
                System.out.println("Choose option customer management");
                inputOpiton2 = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Must enter number");
            }
            switch (inputOpiton2) {
                case 1:
                    customerService.diplayCustomerList();
                    break;
                case 2:
                    customerService.addNewCustomerList();
                    break;
                case 3:
                    customerService.editCustomerList();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Retype option");
            }
        } while (flag);
    }
}

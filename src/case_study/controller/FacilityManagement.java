package case_study.controller;

import case_study.service.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    FacilityService facilityService = new FacilityService();

    public void facilityManagementController() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("---------FacilityManagement--------\n" +
                    "1. Display list Facility\n" +
                    "2. Add new Facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "");
            int inputOpiton3 = 0;
            try {
                System.out.println("Choose option facility management");
                inputOpiton3 = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Must enter number");
            }
            switch (inputOpiton3) {
                case 1:
                    facilityService.displayFacilityMenu();
                    break;
                case 2:
                    facilityService.addNewFacility();
                    break;
                case 3: /// edit customer
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

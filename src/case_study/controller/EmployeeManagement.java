package case_study.controller;

import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public void employeeManagementMenu() {
        EmployeeService employeeService = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----EmployeeManagement-----\n" +
                    "1. Display list employee\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return employee\n" +
                    "");
            int inputOption1 = 0;
            try {
                System.out.println("Choose option employee management");
                inputOption1 = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Must enter number");
            }
            switch (inputOption1) {
                case 1:
                    employeeService.displayEmpoyeeList();
                    break;
                case 2:
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Retype menu");
            }
        } while (flag);
    }
}

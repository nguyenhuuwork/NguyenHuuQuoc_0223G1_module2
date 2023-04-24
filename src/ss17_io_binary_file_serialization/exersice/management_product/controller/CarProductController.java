package ss17_io_binary_file_serialization.exersice.management_product.controller;

import ss17_io_binary_file_serialization.exersice.management_product.service.CarProductService;

import java.util.Scanner;

public class CarProductController {
    CarProductService carProductService = new CarProductService();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    public void showMenu() {
        do {
            System.out.println("-------Chuong Trinh Quan Ly Xe Hoi-------\n" +
                    "1. Them san pham xe \n" +
                    "2. Hien thi menu\n" +
                    "3. Tim kiem san pham\n" +
                    "4. Thoat");
            System.out.println("Moi ban chon chuc nang");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    carProductService.addNewCar();
                    break;
                case 2:
                    carProductService.displayCarList();
                    break;
                case 3:
                  carProductService.findCar();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}

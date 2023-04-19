package MVC.controller;

import MVC.service.FruitService;

import java.util.Scanner;

public class FruitController {
    public void showMenuList() {
        FruitService fruitService = new FruitService();

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn chức năng");
        boolean flag = true;
        do {
            System.out.println("----------Chuong trinh quan ly trai cay----------\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm\n" +
                    "3. Xoá thông tin sản phẩm\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm theo tên\n" +
                    "7. Thoát");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                 fruitService.addFruit();
                    break;
                case 2:
                   fruitService.editFruit();
                    break;
                case 3:
                    //// xoa san pham
                    break;
                case 4:
                    fruitService.displayFruitList();
                    break;
                case 5:
                fruitService.findNameFruit();
                    break;
                case 6:
                    //sap xep san pham
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn nhập sai mời bạn nhập lại");
                    break;
            }
        } while (flag);
    }
}

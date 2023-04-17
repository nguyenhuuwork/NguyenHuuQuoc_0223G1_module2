package ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.controller;

import ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();

    //Thêm sản phẩm
//Sửa thông tin sản phẩm theo id
//Xoá sản phẩm theo id
//Hiển thị danh sách sản phẩm
//Tìm kiếm sản phẩm theo tên
//Sắp xếp sản phẩm tăng dần, giảm dần theo giá
    public void showProductMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("--------Chương trình quản lý sản phẩm--------\n" +
                    "Mời chọn chức năng\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo id\n" +
                    "6. Sắp xếp sản phầm tăng dần, giảm dần theo giá\n" +
                    "7. Thoát");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    productService.addNewProduct();
                    break;
                case 2:
                    productService.editProductId();
                    break;
                case 3:
                    productService.deleteProductId();
                    break;
                case 4:
                    productService.displayProduct();
                    break;
                case 5:
                    productService.findProductName();
                    break;
                case 6:
                    productService.arrangePrice();
                    break;
                case 7:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}

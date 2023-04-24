package ss17_io_binary_file_serialization.exersice.management_product.view;

import ss17_io_binary_file_serialization.exersice.management_product.controller.CarProductController;
import ss17_io_binary_file_serialization.exersice.management_product.service.CarProductService;

public class CarProductView {
    public static void main(String[] args) {
        CarProductController carProductController = new CarProductController();
        carProductController.showMenu();
    }
}

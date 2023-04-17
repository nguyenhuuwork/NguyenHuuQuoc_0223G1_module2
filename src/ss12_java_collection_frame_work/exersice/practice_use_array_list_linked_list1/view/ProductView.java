package ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.view;

import ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.controller.ProductController;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showProductMenu();
    }
}

package ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.repository;

import ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> getProductList();

    void addNewProduct(Product product);

    boolean deleteProductId(String id);

    boolean findProductName(String name);

    boolean editProductId(String id);

    void arrangePrice();
}

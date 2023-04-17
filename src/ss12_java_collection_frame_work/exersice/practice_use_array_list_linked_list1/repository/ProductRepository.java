package ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.repository;

import ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepository implements IProductRepository {

    public ProductRepository() {
    }

    public static ArrayList<Product> productList = new ArrayList<>();

    //String id, String name, double price, boolean quality, int yearOfManufacture
    static {
        Product product1 = new Product("001", "TV SamSung", 10.5, true, 2000);
        Product product2 = new Product("002", "TV Sony", 10.7, true, 2000);
        Product product3 = new Product("003", "TV LG", 10.1, true, 2000);
        Product product4 = new Product("004", "TV Panasonic", 10.3, true, 2000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }

    @Override

    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        productList.add(product);
    }

    @Override
    public boolean deleteProductId(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findProductName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                productList.get(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editProductId(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void arrangePrice() {
        Collections.sort(productList, new Comparator<Product>() {

            @Override
            public int compare(Product product1, Product product2) {
                if (product1.getPrice() < product2.getPrice()) {
                    return -1;
                } else if (product1.getPrice() > product2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}

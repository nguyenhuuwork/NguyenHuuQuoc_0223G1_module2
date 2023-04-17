package ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.service;

import ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.model.Product;
import ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    public ProductService() {
    }

    ProductRepository productRepository = new ProductRepository();

    @Override
    public void displayProduct() {
        for (int i = 0; i < productRepository.getProductList().size(); i++) {
            System.out.println(productRepository.getProductList().get(i));
        }
    }

    //String id, String name, double price, boolean quality, int yearOfManufacture
    @Override
    public void addNewProduct() {
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        double price;
        boolean quality;
        int yearOfManufacture;
        System.out.println("Nhập mã sản phẩm");
        id = sc.nextLine();
        System.out.println("Nhập tên sản phẩm");
        name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chất lượng sản phẩm");
        quality = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập năm sản xuất");
        yearOfManufacture = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price, quality, yearOfManufacture);
        productRepository.addNewProduct(product);
    }

    @Override
    public void deleteProductId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm muốn xoá");
        String inputId = sc.nextLine();
        if (productRepository.deleteProductId(inputId)) {
            System.out.println("Đã xoá sản phẩm");
        } else {
            System.out.println("Không tìm thấy id của sản phẩm");
        }
    }

    public void findProductName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
        String inputName = sc.nextLine();
        if (productRepository.findProductName(inputName)) {
            System.out.println("Sản phẩm nằm trong danh sách");
            System.out.println(productRepository.getProductList());
        } else {
            System.out.println("Sản phẩm nằm ngoài danh sách");
        }
    }

    @Override
    public void arrangePrice() {
        productRepository.arrangePrice();
    }

    public void editProductId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần sửa thông tin");
        String inputId = sc.nextLine();
        if (productRepository.editProductId(inputId)) {
            System.out.println("Nhập mã sản phẩm");
            String id = sc.nextLine();
            productRepository.getProductList().get(Integer.parseInt(inputId)).setId(id);
            System.out.println("Nhập tên sản phẩm");
            String name = sc.nextLine();
            productRepository.getProductList().get(Integer.parseInt(inputId)).setName(name);
            System.out.println("Nhập giá sản phẩm");
            double price = Double.parseDouble(sc.nextLine());
            productRepository.getProductList().get(Integer.parseInt(inputId)).setPrice(price);
            System.out.println("Nhập chất lượng sản phẩm");
            boolean quality = Boolean.parseBoolean(sc.nextLine());
            productRepository.getProductList().get(Integer.parseInt(inputId)).setQuality(quality);
            System.out.println("Nhập năm sản xuất");
            int yearOfManufacture = Integer.parseInt(sc.nextLine());
            productRepository.getProductList().get(Integer.parseInt(inputId)).setYearOfManufacture(yearOfManufacture);

        }
    }


}

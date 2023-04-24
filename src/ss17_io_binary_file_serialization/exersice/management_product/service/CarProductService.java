package ss17_io_binary_file_serialization.exersice.management_product.service;

import ss17_io_binary_file_serialization.exersice.management_product.model.CarProduct;
import ss17_io_binary_file_serialization.exersice.management_product.repository.CarProductRepository;

import java.util.List;
import java.util.Scanner;

public class CarProductService implements ICarProductService {
    Scanner sc = new Scanner(System.in);
    CarProductRepository carProductRepository = new CarProductRepository();

    @Override
    public void displayCarList() {
        List<CarProduct> a = carProductRepository.getCarList();
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    @Override
    public void addNewCar() {
        System.out.println("Nhap id");
        int codeCar = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten xe");
        String nameCar = sc.nextLine();
        System.out.println("Nhap gia");
        double priceCar = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap hang san xuat");
        String manufacture = sc.nextLine();
        System.out.println("Nhap mo ta");
        String describe = sc.nextLine();
        CarProduct carProduct = new CarProduct(codeCar, nameCar, priceCar, manufacture, describe);
        carProductRepository.addNewCar(carProduct);
    }

    @Override
    public void findCar() {
        System.out.println("Nhap id can tim");
        int codeCar =Integer.parseInt(sc.nextLine());
        carProductRepository.findCar(codeCar);
    }
}

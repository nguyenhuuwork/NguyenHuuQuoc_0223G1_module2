package ss17_io_binary_file_serialization.exersice.management_product.repository;

import ss17_io_binary_file_serialization.exersice.management_product.model.CarProduct;

import java.util.List;

public interface ICarProductRepository {
    List<CarProduct> getCarList();
     void addNewCar (CarProduct carProduct);
     void findCar(int codeCar);
}

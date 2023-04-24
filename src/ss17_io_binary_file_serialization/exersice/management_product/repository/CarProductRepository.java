package ss17_io_binary_file_serialization.exersice.management_product.repository;

import ss17_io_binary_file_serialization.exersice.management_product.common.ReaderCar;
import ss17_io_binary_file_serialization.exersice.management_product.common.WriteCar;
import ss17_io_binary_file_serialization.exersice.management_product.model.CarProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarProductRepository implements ICarProductRepository {
    Scanner sc = new Scanner(System.in);
    private static final String FILENAME = "C:\\Code_Gym\\Module2\\src\\ss17_io_binary_file_serialization\\exersice\\" +
            "management_product\\common\\CarProduct.txt";
    public static List<CarProduct> carProductList = new ArrayList<>();


    //int codeCar, String nameCar, double priceCar, String manufacture, String describe
    static {
        CarProduct car1 = new CarProduct(1, "Honda", 100.20, "Honda", "Save fuel");
        CarProduct car2 = new CarProduct(2, "Cerato", 700.5, "Thaco", "Safety");
        CarProduct car3 = new CarProduct(3, "Mazda 3", 900.80, "Marda", "Style");
        CarProduct car4 = new CarProduct(4, "Corolla Altis ", 800.20, "Toyota", "Breast");
        carProductList.add(car1);
        carProductList.add(car2);
        carProductList.add(car3);
        carProductList.add(car4);
        WriteCar.writeCar(FILENAME, carProductList, false);
    }

    @Override
    public List<CarProduct> getCarList() {
        List<CarProduct> listCarHung
        = ReaderCar.readCar(FILENAME);
        return listCarHung;
    }

    @Override
    public void addNewCar(CarProduct carProduct) {
        List<CarProduct> listCarHung = ReaderCar.readCar(FILENAME);
        if (listCarHung.size() == 0) {
            listCarHung.add(carProduct);
            WriteCar.writeCar(FILENAME, listCarHung, true);
        } else {
            listCarHung.add(carProduct);
            WriteCar.writeCar(FILENAME, listCarHung, false);
        }
    }

    @Override
    public void findCar(int codeCar) {
        boolean flag =true;
        int index =0;
        for (int i = 0; i <carProductList.size() ; i++) {
            if (carProductList.get(i).getCodeCar()==codeCar){
                index =i;
                flag =true;
                break;
            }
        }
        if (flag){
            System.out.println(carProductList.get(index));
        }else {
            System.out.println("Khong co id can tim");
        }
    }
}

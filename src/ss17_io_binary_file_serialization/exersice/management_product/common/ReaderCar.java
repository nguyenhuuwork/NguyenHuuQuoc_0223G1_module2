package ss17_io_binary_file_serialization.exersice.management_product.common;

import ss17_io_binary_file_serialization.exersice.management_product.model.CarProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderCar {
    public static List<CarProduct> readCar(String link) {
        List<CarProduct> listHung =null;
//        CarProduct carHung = new CarProduct();
        try {
            FileInputStream fileInputStream = new FileInputStream(link);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            listHung = (List<CarProduct>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidClassException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listHung;
    }
}

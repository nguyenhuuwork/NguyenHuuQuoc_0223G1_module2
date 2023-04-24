package ss17_io_binary_file_serialization.exersice.management_product.common;

import ss17_io_binary_file_serialization.exersice.management_product.model.CarProduct;

import java.io.*;
import java.util.List;

public class WriteCar {
    public static void writeCar(String link, List<CarProduct> carProduct, boolean flag) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(link, flag);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(carProduct);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidClassException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

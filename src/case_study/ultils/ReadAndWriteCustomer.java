package case_study.ultils;

import case_study.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static void writeCustomerListToFile(List<Customer> customerList, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c : customerList) {
                bufferedWriter.write(c.getInformationToCsvCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Customer> readCustomerListToFile(String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrCus = line.split("");
//String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
//                    String email, String customerType, String address
                Customer customer = new Customer(arrCus[0], arrCus[1], arrCus[2], Boolean.parseBoolean(arrCus[3]), arrCus[4]
                        , arrCus[5], arrCus[6], arrCus[7], arrCus[8]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}

package case_study.repository;

import case_study.model.Customer;
import case_study.ultils.ReadAndWriteCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();

    private static final String CUSTOMER_FILE_PATH = "C:\\Code_Gym\\Module2\\src\\case_study\\data\\customer.csv";

    @Override
    public List<Customer> getListCustomer() {
        customerList = ReadAndWriteCustomer.readCustomerListToFile(CUSTOMER_FILE_PATH);
        return customerList;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        customerList.add(customer);
        ReadAndWriteCustomer.writeCustomerListToFile(customerList, CUSTOMER_FILE_PATH);
    }
}

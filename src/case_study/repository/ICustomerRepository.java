package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getListCustomer();

    void addNewCustomer(Customer customer);

    Customer findCustomerByCode(String code);

    void editCustomer(String code, Customer customer);

}

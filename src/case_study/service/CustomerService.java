package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.EmployeeRepository;
import case_study.ultils.CustomerRegex;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override

    public void diplayCustomerList() {
        List<Customer> customerList = customerRepository.getListCustomer();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewCustomerList() {
//String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
//                    String email, String customerType, String address
        String code;
        do {
            System.out.println("Enter code customer");
            code = sc.nextLine();
        } while (!CustomerRegex.checkCode(code));
        String name;
        do {
            System.out.println("Enter name customer");
            name = sc.nextLine();
        } while (!CustomerRegex.checkName(name));
        String dateOfBirth;
        do {
            System.out.println("Enter date of birth customer");
            dateOfBirth = sc.nextLine();
        } while (!CustomerRegex.checkDate(dateOfBirth));
        boolean gender = false;
        boolean flag = true;
        do {
            System.out.println("Choose gender customer\n" +
                    "1. Male\n" +
                    "2. Female");
            String checkGender = sc.nextLine();
            if (checkGender.trim().equals("1")) {
                gender = true;
                flag = false;
            } else if (checkGender.trim().equals("2")) {
                gender = false;
                flag = false;
            } else {
                System.out.println("Choose again");
                flag = true;
            }
        } while (flag);
        String indetify;
        do {
            System.out.println("Enter identify customer");
            indetify = sc.nextLine();
        } while (!CustomerRegex.checkIdentify(indetify));
        String phoneNumber;
        do {
            System.out.println("Enter phonenumber customer");
            phoneNumber = sc.nextLine();
        } while (!CustomerRegex.checkPhoneNumber(phoneNumber));
        System.out.println("Enter email customer");
        String email = sc.nextLine();

        //Loại Customer bao gồm: (Diamond, Platinum, Gold, Silver, Member).
        String typeCustomer = "";
        boolean flagType;
        do {
            System.out.println("Enter type customer\n" +
                    "1. Diamond\n" +
                    "2. Platuium\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n");
            String chooseTypeCustomer = sc.nextLine();
            switch (chooseTypeCustomer) {
                case "1":
                    typeCustomer = "Dinamond";
                    flagType = false;
                    break;
                case "2":
                    typeCustomer = "Platium";
                    flagType = false;
                    break;
                case "3":
                    typeCustomer = "Gold";
                    flagType = false;
                    break;
                case "4":
                    typeCustomer = "Silver";
                    flagType = false;
                    break;
                case "5":
                    typeCustomer = "Member";
                    flagType = false;
                    break;
                default:
                    System.out.println("You enter wrong type customer, please enter again");
                    flagType = true;
            }
        } while (flagType);
        System.out.println("Enter address customer");
        String address = sc.nextLine();
        //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
//                    String email, String customerType, String address
        Customer customer = new Customer(code, name, dateOfBirth, gender, indetify, phoneNumber, email, typeCustomer, address);
        customerRepository.addNewCustomer(customer);
        System.out.println("Successfull add");
    }

    @Override
    public void editCustomerList() {
        this.diplayCustomerList();
        String codeFind;
        do {
            System.out.println("Enter code customer to check");
            codeFind = sc.nextLine();
        } while (!CustomerRegex.checkCode(codeFind));
        Customer customer = customerRepository.findCustomerByCode(codeFind);
        String nameSet;
        do {
            System.out.println("Enter name Customer to set");
            nameSet = sc.nextLine();
        } while (!CustomerRegex.checkName(nameSet));
        customer.setName(nameSet);
        String dateSet;
        do {
            System.out.println(" Enter date of birth to set");
            dateSet = sc.nextLine();
        } while (!CustomerRegex.checkDate(dateSet));
        customer.setDateOfBirth(dateSet);
        boolean flag = true;
        boolean genderSet = false;
        do {
            System.out.println("Choose gender customer to set\n" +
                    "1. Male\n" +
                    "2. Female\n" +
                    "");
            String checkGender = sc.nextLine();
            if (checkGender.trim().equals("1")) {
                customer.setGender(true);
            } else if (checkGender.trim().equals("2")) {
                customer.setGender(false);
                flag = false;
            } else {
                System.out.println("Choose again");
                flag = true;
            }
        } while (flag);
        //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
        //                    String email, String customerType, String address
        String identify;
        do {
            System.out.println("Enter identify to set");
            identify = sc.nextLine();
        } while (!CustomerRegex.checkIdentify(identify));
        customer.setIndentity(identify);
        String phoneNumber;
        do {
            System.out.println("Enter phone number to set");
            phoneNumber = sc.nextLine();
        } while (!CustomerRegex.checkPhoneNumber(phoneNumber));
        customer.setPhoneNumber(phoneNumber);
        System.out.println("Enter email to set");
        String email = sc.nextLine();
        customer.setEmail(email);
        String customerType = "";
        boolean flagCustomer;
        do {
            System.out.println("Choose customer type to set\n" +
                    "1. Dianamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member");
            String chooseTypeCustomer = sc.nextLine();
            switch (chooseTypeCustomer) {
                case "1":
                    customerType = "Dianamond";
                    flagCustomer = false;
                    break;
                case "2":
                    customerType = "Platiumm";
                    flagCustomer = false;
                    break;
                case "3":
                    customerType = "Gold";
                    flagCustomer = false;
                    break;
                case "4":
                    customerType = "Silver";
                    flagCustomer = false;
                    break;
                case "5":
                    customerType = "Member";
                    flagCustomer = false;
                    break;
                default:
                    System.out.println("you enter wrong customer type please enter again");
                    flagCustomer = true;
            }
        } while (flagCustomer);
        customer.setCustomerType(customerType);

        System.out.println("Enter adress to set");
        String address = sc.nextLine();
        customerRepository.editCustomer(codeFind,customer);
    }
}

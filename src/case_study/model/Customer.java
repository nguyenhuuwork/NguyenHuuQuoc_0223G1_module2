package case_study.model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer(String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
                    String email, String customerType, String address) {
        super(code, name, dateOfBirth, gender, indentity, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return   super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\''
                ;
    }

    //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
//                    String email, String customerType, String address
    public String getInformationToCsvCustomer() {
        return super.getCode() + "," + super.getName() + "," + super.getDateOfBirth() + "," + super.isGender() + "," +
                super.getIndentity() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + this.customerType +
                "," + this.address;
    }
}

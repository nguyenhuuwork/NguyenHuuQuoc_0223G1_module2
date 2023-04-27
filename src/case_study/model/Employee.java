package case_study.model;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee(String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
                    String email, String level, String position, double salary) {
        super(code, name, dateOfBirth, gender, indentity, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    //code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
//                    String email, String level, String position, double salary
    public String getInformationToCsv() {
        return super.getCode() + "," + super.getName() + "," + super.getDateOfBirth() + "," + super.isGender() + ","
                + super.getIndentity() + "," +
                super.getPhoneNumber() + "," + super.getEmail() + "," + level + "," + position + "," + salary;
    }
}

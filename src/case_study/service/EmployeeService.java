package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.ultils.EmployeeRegex;
import case_study.ultils.ReadAndWriteEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);

    private EmployeeRepository employeeRepository = new EmployeeRepository();


    @Override

    public void displayEmpoyeeList() {
        List<Employee> employeeList = employeeRepository.getEmployee();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewEmployee() {
        //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
        //                    String email, String level, String position, double salary
        //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
        //                    String email, String level, String position, double salary
        //-	Mã nhân viên phải đúng định dạng: NV-YYYY, với YYYY là các số từ 0-9.
        //-	Tên nhân viên phải viết hoa các ký tự đầu của mỗi từ.
        //-	Phải đủ 18 tuổi (tính cả ngày + tháng)
        //-	CMND phải đủ 9 hoặc 12 số.
        //-	Số điện thoại phải bắt đầu từ 0 và đủ 10 số.
        //-	Lương phải lớn hơn 0.
        String code;
        do {
            System.out.println("Enter code employee");
            code = sc.nextLine();
        } while (!EmployeeRegex.checkCode(code));
        String name;
        do {
            System.out.println("Enter name employee");
            name = sc.nextLine();
        } while (!EmployeeRegex.checkName(name));
        String dateOfBirth;
        do {
            System.out.println("Enter date of birth employee");
            dateOfBirth = sc.nextLine();
        } while (!EmployeeRegex.checkDate(dateOfBirth));
        boolean flag = true;
        boolean gender = false;
        do {
            System.out.println("Chosse gender employee\n" +
                    "1. Male\n" +
                    "2. Female\n");
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
        String identyfy;
        do {
            System.out.println("Enter identify employee");
            identyfy = sc.nextLine();
        } while (!EmployeeRegex.checkIdentify(identyfy));
        String phoneNumber;
        do {
            System.out.println("Enter phonenumber employee");
            phoneNumber = sc.nextLine();
        } while (!EmployeeRegex.checkPhoneNumber(phoneNumber));
        System.out.println("Enter email employee");
        String email = sc.nextLine();

        String level = "";
        boolean flagLevel;
        do {
            System.out.println("Choose level employee\n" +
                    "1. Imtermedia\n" +
                    "2. College\n" +
                    "3. University\n" +
                    "4. After University");
            String chooseLevel = sc.nextLine();

            switch (chooseLevel) {
                case "1":
                    level = "Imtermedia";
                    flagLevel = false;
                    break;
                case "2":
                    level = "College";
                    flagLevel = false;
                    break;
                case "3":
                    level = "University";
                    flagLevel = false;
                    break;
                case "4":
                    level = "After University";
                    flagLevel = false;
                    break;
                default:
                    System.out.println("You enter wrong level please enter again");
                    flagLevel = true;
            }
        } while (flagLevel);
        //Vị trí sẽ lưu trữ các thông tin: lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
        String position = "";
        boolean flagLevel2;
        do {
            System.out.println("Choose position employee\n" +
                    "1. Receptionist\n" +
                    "2. Serve\n" +
                    "3. Expert\n" +
                    "4. Supervior\n" +
                    "5. Manager\n" +
                    "6. Gerneral Manager");
            String choosePosition = sc.nextLine();

            switch (choosePosition) {
                case "1":
                    position = "Receptionist";
                    flagLevel2 = false;
                    break;
                case "2":
                    position = "Serve";
                    flagLevel2 = false;
                    break;
                case "3":
                    position = "Expert";
                    flagLevel2 = false;
                    break;
                case "4":
                    position = "Supervior";
                    flagLevel2 = false;
                    break;
                case "5":
                    position = "Manager";
                    flagLevel2 = false;
                    break;
                case "6":
                    position = "Gerneral Manager";
                    flagLevel2 = false;
                    break;
                default:
                    System.out.println("You enter wrong position please enter again");
                    flagLevel2 = true;
            }
        } while (flagLevel2);
        String salary;
        do {
            System.out.println("Enter salary employee");
            salary = sc.nextLine();
        } while (!EmployeeRegex.checkSalary(salary));
        double salary1 = Double.parseDouble(salary);
        //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
        //                    String email, String level, String position, double salary
        Employee employee = new Employee(code, name, dateOfBirth, gender, identyfy, phoneNumber, email, level, position,
                salary1);
        employeeRepository.addNewEmployee(employee);
        System.out.println("Successfull add");
    }

}

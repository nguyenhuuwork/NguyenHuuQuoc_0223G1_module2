package case_study.repository;

import case_study.model.Employee;
import case_study.ultils.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();

    private static final String EMPLOYEE_FILE_PATH = "C:\\Code_Gym\\Module2\\src\\case_study\\data\\employee.csv";

    @Override
    public List<Employee> getEmployee() {
        employeeList = ReadAndWriteEmployee.readEmployeeListFromFile(EMPLOYEE_FILE_PATH);
        return employeeList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        ReadAndWriteEmployee.writeEmployeeListToFile(employeeList, EMPLOYEE_FILE_PATH);
    }
}

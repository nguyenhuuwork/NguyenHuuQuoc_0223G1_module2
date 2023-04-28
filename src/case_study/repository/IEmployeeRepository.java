package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getEmployee();

    void addNewEmployee(Employee employee);

    Employee findEmployeeByCode(String code);

    void editEmployee(String code, Employee employee);
}

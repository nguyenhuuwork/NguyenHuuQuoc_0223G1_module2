package case_study.ultils;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static void writeEmployeeListToFile(List<Employee> employeeList, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employeeList) {
                bufferedWriter.write(e.getInformationToCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Employee> readEmployeeListFromFile(String path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employArr = line.split(",");
//String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
//                    String email, String level, String position, double salary
                Employee employee = new Employee(employArr[0], employArr[1], employArr[2],
                        Boolean.parseBoolean(employArr[3]), employArr[4], employArr[5], employArr[6], employArr[7],
                        employArr[8], Double.parseDouble(employArr[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}

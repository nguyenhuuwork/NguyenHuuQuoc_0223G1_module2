package ss10_dsa_list.exersice.additional_exersice.service;

import ss10_dsa_list.exersice.additional_exersice.model.Student;
import ss10_dsa_list.exersice.additional_exersice.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    public StudentService() {
    }

    StudentRepository studentRepository = new StudentRepository();

    @Override
    public void displayStudentList() {
        for (int i = 0; i < studentRepository.getStudentList().size(); i++) {
            System.out.println(studentRepository.getStudentList().get(i));
        }
    }

    @Override
    public void addNewStudent() {
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        int dateOfBirthStudent;
        boolean gender;
        String classes;
        double score;
        System.out.println("Nhập id học viên");
        id = sc.nextLine();
        System.out.println("Nhập tên học viên");
        name = sc.nextLine();
        System.out.println("Nhâp năm sinh học viên");
        dateOfBirthStudent = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính học viên");
        gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập lớp cho học viên");
        classes = sc.nextLine();
        System.out.println("Nhập điểm số cho học viên");
        score = Double.parseDouble(sc.nextLine());
        Student student = new Student(id, name, dateOfBirthStudent, gender, classes, score);
        studentRepository.addNewStudent(student);
        displayStudentList();
    }

    @Override
    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần kiểm tra");
        String inputId = sc.nextLine();
        if (studentRepository.deleteStudent(inputId)) {
            System.out.println("Đã thực hiện xoá học viên");
        } else {
            System.out.println("Không tìm thấy id học viên");
        }
    }
}

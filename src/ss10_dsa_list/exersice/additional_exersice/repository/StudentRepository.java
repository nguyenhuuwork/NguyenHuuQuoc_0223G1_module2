package ss10_dsa_list.exersice.additional_exersice.repository;

import ss10_dsa_list.exersice.additional_exersice.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    public static ArrayList<Student> studentList = new ArrayList<>();

    //String id, String nameStudent, int dateOfBirth, boolean gender, String classes, double score
    static {
        Student student1 = new Student("1", "Nguyen Van A", 1990, true, "C0223G1", 9.5);
        Student student2 = new Student("2", "Nguyen Thi B", 1991, false, "C0223G1", 9.6);
        Student student3 = new Student("3", "Nguyen Van C", 1992, true, "C0223G1", 9.7);
        Student student4 = new Student("4", "Nguyen THi D", 1993, false, "C0223G1", 9.8);
        Student student5 = new Student("5", "Nguyen Van E", 1994, true, "C0223G1", 9.9);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
    }

    public StudentRepository() {
    }

    @Override
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean deleteStudent(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
}


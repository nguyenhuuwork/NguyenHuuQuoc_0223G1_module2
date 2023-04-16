package ss10_dsa_list.exersice.additional_exersice.repository;

import ss10_dsa_list.exersice.additional_exersice.model.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> getStudentList();

    void addNewStudent(Student student);
    boolean deleteStudent(String id);
}


package MVC_Demo.repository;

import MVC_Demo.model.Teacher;

import java.util.ArrayList;

public interface ITeacherRepository {
    ArrayList<Teacher> getTeacherList();

    void addNewTeacher(Teacher teacher);

    void editTeacher(int index, Teacher teacher);
}

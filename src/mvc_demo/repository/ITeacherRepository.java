package mvc_demo.repository;

import mvc_demo.model.Teacher;

import java.util.ArrayList;

public interface ITeacherRepository {
    ArrayList<Teacher> getTeacherList();

    void addNewTeacher(Teacher teacher);

    void editTeacher(int index, Teacher teacher);
}

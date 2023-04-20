package MVC_Demo.repository;

import MVC_Demo.model.Teacher;

import java.util.ArrayList;

public class TeacherRepository implements ITeacherRepository {
    public static ArrayList<Teacher> teacherList = new ArrayList<>();

    static {
        Teacher teacher1 = new Teacher(1, "Cao", "caoKhongthap@gmail.com");
        Teacher teacher2 = new Teacher(2, "Thap", "thapkhongcao@gmail.com");
        Teacher teacher3 = new Teacher(3, "To", "tokhongbe@gmail.com");
        Teacher teacher4 = new Teacher(4, "Bu", "bekhongto@gmail.com");
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
    }

    @Override
    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void editTeacher(int index, Teacher teacher) {
        teacherList.set(index, teacher);
    }
}

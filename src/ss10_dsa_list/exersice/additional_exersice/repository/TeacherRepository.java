package ss10_dsa_list.exersice.additional_exersice.repository;

import ss10_dsa_list.exersice.ArrayList;
import ss10_dsa_list.exersice.additional_exersice.model.Teacher;

public class TeacherRepository implements ITeacherRepository {

    public static ArrayList<Teacher> teacherList = new ArrayList<>();

    static {
        Teacher teacher1 = new Teacher("1", "Nguyen Anh Cong", 1991, true, "Dai Hoc");
        Teacher teacher2 = new Teacher("2", "Nguyen Anh Trung", 2000, true, "Dai Hoc");
        Teacher teacher3 = new Teacher("3", "Nguyen Anh Nhan", 1995, true, "Dai Hoc");
        Teacher teacher4 = new Teacher("4", "Nguyen Anh Chanh", 1986, true, "Dai Hoc");
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
    }

    public TeacherRepository() {
    }


    @Override
    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }
}

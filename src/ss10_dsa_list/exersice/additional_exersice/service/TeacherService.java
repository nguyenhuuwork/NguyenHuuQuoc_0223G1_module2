package ss10_dsa_list.exersice.additional_exersice.service;

import ss10_dsa_list.exersice.ArrayList;
import ss10_dsa_list.exersice.additional_exersice.model.Teacher;
import ss10_dsa_list.exersice.additional_exersice.repository.TeacherRepository;

public class TeacherService implements ITeacherService {
    public TeacherService() {
    }

    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void displayTeacherList() {
        ArrayList<Teacher> a = teacherRepository.getTeacherList();
    }
}

package mvc_demo.service;

import mvc_demo.model.Teacher;
import mvc_demo.repository.TeacherRepository;

import java.util.Scanner;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayTeacherList() {
        for (int i = 0; i < teacherRepository.getTeacherList().size(); i++) {
            System.out.println(teacherRepository.getTeacherList().get(i));
        }
    }

    @Override
    public void addNewTeacher() {
        System.out.println("Nhập id của giáo viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên giáo viêc");
        String name = sc.nextLine();
        System.out.println("Nhập gmail của giáo viên");
        String gmail = sc.nextLine();
        Teacher teacher = new Teacher(id, name, gmail);
        teacherRepository.addNewTeacher(teacher);
    }

    @Override
    public void editTeacher() {
        System.out.println("Mời bạn nhập ID để kiểm tra");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < teacherRepository.getTeacherList().size(); i++) {
            if (teacherRepository.getTeacherList().get(i).getId() == id) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Nhập id cần chỉnh sửa");
            int idEdit = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên giáo viên");
            String name = sc.nextLine();
            System.out.println("Nhập gmail của giáo viên");
            String gmail = sc.nextLine();
            Teacher teacher = new Teacher(idEdit, name, gmail);
            teacherRepository.editTeacher(index, teacher);
        } else {
            System.out.println("Không có id cần kiểm tra");
        }
    }
}

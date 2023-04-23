package mvc_demo.controller;

import mvc_demo.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    TeacherService teacherService = new TeacherService();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    public void showMenu() {
        do {
            System.out.println("--------Chương trình quản lý giáo viên---------\n" +
                    "1. Thêm giáo viên\n" +
                    "2. Sửa thông tin giáo viên\n" +
                    "3. Hiện thị danh sách giáo viên\n" +
                    "4. Xoá giáo viên\n" +
                    "5. Thoát\n" +
                    "");
            System.out.println("Mời bạn chọn chức năng");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    teacherService.addNewTeacher();
                    break;
                case 2:
                    teacherService.editTeacher();
                    break;
                case 3:
                    teacherService.displayTeacherList();
                    break;
                case 4:
                    /// xoa
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập chọn lại chức năng");
            }
        } while (flag);
    }
}

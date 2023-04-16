package ss10_dsa_list.exersice.additional_exersice.controller;

import ss10_dsa_list.exersice.additional_exersice.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public StudentController() {
    }

    public void showStudentMenu() {
        StudentService studentService = new StudentService();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN------------\n" +
                    "Chọn chức năng theo số\n" +
                    "1. Thêm mới sinh viên hoặc thêm mới giảng viên\n" +
                    "2. Xoá sinh viên hoặc xoá giảng viên\n" +
                    "3. Xem danh sách\n" +
                    "4. Thoát\n" +
                    "");
            System.out.println("Mời nhập chức năng");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    studentService.addNewStudent();
                    break;
                case 2:
                    studentService.deleteStudent();
                    break;
                case 3:
                    studentService.displayStudentList();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhap lai de chon chuc nang");
                    break;
            }
        } while (flag);
    }
}

package ss10_dsa_list.exersice.additional_exersice;

import java.util.Scanner;

public class WCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageStudent ms1 = new ManageStudent();
        int option = 4;
        do {
            System.out.println("Menu -----------");
            System.out.println("Chon chuc nang");
            System.out.println(
                    "1.Them hoc sinh vao danh sach.\n"
                            + "2.Xoa hoc sinh vao danh sach.\n"
                            + "3.Them hoc sinh vao danh sach.\n"
                            + "4.Thoat"
            );
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Enter codeStudent");
                String codeStudent = sc.nextLine();
                System.out.println("Enter nameStudent");
                String nameStudent = sc.nextLine();
                System.out.println("Enter dateOfBirthStudent");
                int dateOfBirth = sc.nextInt();
                System.out.println("Enter genderStudent");
                String genderStudent = sc.nextLine();
                System.out.println("Enter group");
                String group = sc.nextLine();
                System.out.println("Enter score");
                float score = sc.nextFloat();
                Student sv = new Student(codeStudent, nameStudent, dateOfBirth, genderStudent, group, score);
                ms1.addStudent(sv);
            } else if (option == 2) {

            } else if (option == 3) {

            }
        } while (option != 4);
    }
}

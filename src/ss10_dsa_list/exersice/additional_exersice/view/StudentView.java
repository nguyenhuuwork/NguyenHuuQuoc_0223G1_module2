package ss10_dsa_list.exersice.additional_exersice.view;

import ss10_dsa_list.exersice.additional_exersice.controller.StudentController;

public class StudentView {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showStudentMenu();
    }
}

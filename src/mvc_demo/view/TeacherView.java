package mvc_demo.view;

import mvc_demo.controller.TeacherController;

public class TeacherView {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.showMenu();
    }
}


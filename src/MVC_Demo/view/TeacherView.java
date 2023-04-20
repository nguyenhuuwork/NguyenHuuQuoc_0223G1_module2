package MVC_Demo.view;

import MVC_Demo.controller.TeacherController;
import MVC_Demo.service.TeacherService;

public class TeacherView {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.showMenu();
    }
}


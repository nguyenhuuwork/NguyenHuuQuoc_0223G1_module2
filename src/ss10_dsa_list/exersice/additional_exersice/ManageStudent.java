package ss10_dsa_list.exersice.additional_exersice;

import ss10_dsa_list.exersice.ArrayList;

public class ManageStudent {
    private ArrayList<Student> listStudent;

    public ManageStudent() {
        this.listStudent = new ArrayList<Student>();
    }

    public ManageStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void addStudent(Student sv) {
        this.listStudent.add(sv);
    }
}

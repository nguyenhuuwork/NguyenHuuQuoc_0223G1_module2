package ss10_dsa_list.exersice.additional_exersice.model;

public class Student extends Person {
    private String classes;
    private double score;

    public Student(String id, String nameStudent, int dateOfBirth, boolean gender, String classes, double score) {
        super(id, nameStudent, dateOfBirth, gender);
        this.classes = classes;
        this.score = score;
    }

    public Student() {
    }

    public String getClasses() {
        return classes;
    }

    public double getScore() {
        return score;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}

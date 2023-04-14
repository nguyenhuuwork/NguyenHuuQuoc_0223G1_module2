package ss10_dsa_list.exersice.additional_exersice;

public class Student {
    private String codeStudent;
    private String nameStudent;
    private int dateOfBirthStudent;
    private String genderStudent;
    private String group;
    private float score;

    public Student() {
    }

    public Student(String codeStudent, String nameStudent, int dateOfBirthStudent, String genderStudent, String group, float score) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.dateOfBirthStudent = dateOfBirthStudent;
        this.genderStudent = genderStudent;
        this.group = group;
        this.score = score;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getDateOfBirthStudent() {
        return dateOfBirthStudent;
    }

    public String getGenderStudent() {
        return Student.this.genderStudent;
    }

    public String getGroup() {
        return group;
    }

    public float getScore() {
        return score;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setDateOfBirthStudent(int dateOfBirthStudent) {
        this.dateOfBirthStudent = dateOfBirthStudent;
    }

    public void setGenderStudent(String genderStudent) {
        this.genderStudent = this.genderStudent;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setScore(float score) {
        this.score = score;
    }
}

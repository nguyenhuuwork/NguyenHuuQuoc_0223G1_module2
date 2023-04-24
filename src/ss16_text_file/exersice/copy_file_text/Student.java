package ss16_text_file.exersice.copy_file_text;

public class Student {
    private int code;
    private String nameStudent;
    private double score;

    public Student() {
    }

    public Student(int code, String nameStudent, double score) {
        this.code = code;
        this.nameStudent = nameStudent;
        this.score = score;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", nameStudent='" + nameStudent + '\'' +
                ", score=" + score +
                '}';
    }

    public String getInformationToCsv() {
        return code + "," + nameStudent + "," + score;
    }
}

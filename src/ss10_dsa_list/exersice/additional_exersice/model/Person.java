package ss10_dsa_list.exersice.additional_exersice.model;

public abstract class Person {
    private String id;
    private String nameStudent;
    private int dateOfBirth;
    private boolean gender;

    public Person(String id, String nameStudent, int dateOfBirth, boolean gender) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }
}

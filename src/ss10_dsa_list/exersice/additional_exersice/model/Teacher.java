package ss10_dsa_list.exersice.additional_exersice.model;

public class Teacher extends Person {
    String specialize;

    public Teacher(String id, String nameStudent, int dateOfBirth, boolean gender, String specialize) {
        super(id, nameStudent, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }
}

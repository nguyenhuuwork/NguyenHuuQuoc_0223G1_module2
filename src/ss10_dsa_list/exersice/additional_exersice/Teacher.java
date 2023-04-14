package ss10_dsa_list.exersice.additional_exersice;

public class Teacher {
    private String codeTeacher;
    private String nameTeacher;
    private int dateOfBirthTeacher;
    private String genderTeacher;
    private String specialize;

    public Teacher() {
    }

    public Teacher(String codeTeacher, String nameTeacher, int dateOfBirthTeacher, String genderTeacher, String specialize) {
        this.codeTeacher = codeTeacher;
        this.nameTeacher = nameTeacher;
        this.dateOfBirthTeacher = dateOfBirthTeacher;
        this.genderTeacher = genderTeacher;
        this.specialize = specialize;
    }

    public String getCodeTeacher() {
        return codeTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public int getDateOfBirthTeacher() {
        return dateOfBirthTeacher;
    }

    public String getGenderTeacher() {
        return genderTeacher;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setCodeTeacher(String codeTeacher) {
        this.codeTeacher = codeTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public void setDateOfBirthTeacher(int dateOfBirthTeacher) {
        this.dateOfBirthTeacher = dateOfBirthTeacher;
    }

    public void setGenderTeacher(String genderTeacher) {
        this.genderTeacher = genderTeacher;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

}

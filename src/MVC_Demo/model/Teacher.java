package MVC_Demo.model;

public class Teacher {
    private int id;
    private String name;
    private String gmail;

    public Teacher(int id, String name, String gmail) {
        this.id = id;
        this.name = name;
        this.gmail = gmail;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}

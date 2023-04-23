package ss16_text_file.exersice.read_flie;

public class National {
    private int id;
    private String code;
    private String name;

    public National(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public National() {
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\''
                ;

    }
}

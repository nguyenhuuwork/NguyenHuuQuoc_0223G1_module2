package ss16_text_file.exersice.read_write_again;

public class NguyenVietCao {
    private String name;
    private double height;
    private double weight;
    private int code;
    private String address;

    public NguyenVietCao() {
    }

    public NguyenVietCao(String name, double height, double weight, int code, String address) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.code = code;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NguyenVietCao{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", code=" + code +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInformationToCsv() {
        return name + "," + height + "," + weight + "," + code + "," + address;
    }
}

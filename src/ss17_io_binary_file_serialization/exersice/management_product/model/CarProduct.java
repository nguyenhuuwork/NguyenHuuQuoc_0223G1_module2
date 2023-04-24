package ss17_io_binary_file_serialization.exersice.management_product.model;

import java.io.Serializable;

public class CarProduct implements Serializable {
    private int codeCar;
    private String nameCar;
    private double priceCar;
    private String manufacture;
    private String describe;

    public CarProduct() {
    }

    public CarProduct(int codeCar, String nameCar, double priceCar, String manufacture, String describe) {
        this.codeCar = codeCar;
        this.nameCar = nameCar;
        this.priceCar = priceCar;
        this.manufacture = manufacture;
        this.describe = describe;
    }

    public int getCodeCar() {
        return codeCar;
    }

    public void setCodeCar(int codeCar) {
        this.codeCar = codeCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "CarProduct.txt{" +
                "codeCar=" + codeCar +
                ", nameCar='" + nameCar + '\'' +
                ", priceCar=" + priceCar +
                ", manufacture='" + manufacture + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String getInformationToCsv() {
        return codeCar + "," + nameCar + "," + priceCar + "," + manufacture + "," + describe;
    }
}

package ss12_java_collection_frame_work.exersice.practice_use_array_list_linked_list1.model;

public class Product {
    private String id;
    private String name;
    private double price;
    private boolean quality;
    private int yearOfManufacture;

    public Product(String id, String name, double price, boolean quality, int yearOfManufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isQuality() {
        return quality;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuality(boolean quality) {
        this.quality = quality;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}

package ss6_inheritance.exersice.circle_cylinder;

public class Cylinder extends Circle {
    private double high;

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double volumeCylinder() {
        return this.areaCircle() * this.high;
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString() +
                "high=" + this.high +
                '}';
    }
}

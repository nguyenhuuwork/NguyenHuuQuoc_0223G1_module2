package ss7_abstract_interface.exersice.interface_colorable;

public class Circle implements IResizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * (1 - percent / 100);
        System.out.println(areaCircle());
    }
}

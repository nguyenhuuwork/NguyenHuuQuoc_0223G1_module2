package ss7_abstract_interface.exersice.interface_colorable;

public class Rectangle implements IResizeable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double areaRectangle() {
        return this.length * this.width;
    }

    @Override
    public void resize(double percent) {
        this.length = this.length * (1 - (percent / 100));
        this.width = this.width * (1 - (percent / 100));
        System.out.println(areaRectangle());
    }
}

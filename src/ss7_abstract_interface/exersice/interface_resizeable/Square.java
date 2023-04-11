package ss7_abstract_interface.exersice.interface_resizeable;

public class Square extends Shape implements IColorable {
    private double egde;

    public Square(String color, double egde) {
        super(color);
        this.egde = egde;
    }

    public Square(double egde) {
        this.egde = egde;
    }

    public Square() {
    }

    public double getEgde() {
        return egde;
    }

    public void setEgde(double egde) {
        this.egde = egde;
    }

    public double areaSquare() {
        return egde * egde;
    }

    @Override
    public String toString() {
        return "Square{" +
                "egde=" + egde +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

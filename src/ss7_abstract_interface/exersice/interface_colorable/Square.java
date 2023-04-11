package ss7_abstract_interface.exersice.interface_colorable;

public class Square implements IResizeable {
    private double egde;

    public Square(double egde) {
        this.egde = egde;
    }

    public double getEgde() {
        return egde;
    }

    public void setEgde(double egde) {
        this.egde = egde;
    }

    public double areaSquare() {
        return this.egde * this.egde;
    }

    @Override
    public void resize(double percent) {
        this.egde = this.egde * (1 - (percent / 100));
        System.out.println(areaSquare());
    }
}

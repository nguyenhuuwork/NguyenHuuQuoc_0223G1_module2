package ss7_abstract_interface.exersice.interface_resizeable;

public class WCheck {
    public static void main(String[] args) {
        Shape[] s1 = new Shape[3];
        s1[0] = new Circle();
        s1[1] = new Rectangle();
        s1[2] = new Square(4);
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] instanceof Square) {
                Square c1 = (Square) s1[i];
                c1.howToColor();
                System.out.println(c1.areaSquare());
            }
        }
    }
}

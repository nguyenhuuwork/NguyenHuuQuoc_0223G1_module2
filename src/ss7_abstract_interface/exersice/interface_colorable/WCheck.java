package ss7_abstract_interface.exersice.interface_colorable;

import java.util.Arrays;

public class WCheck {
    public static void main(String[] args) {
        IResizeable[] ir1 = new IResizeable[3];
        ir1[0] = new Circle(4);
        ir1[1] = new Rectangle(5, 4);
        ir1[2] = new Square(4);
        for (IResizeable outPut : ir1) {
            if (outPut instanceof Circle) {
                ((Circle) outPut).resize(20);
            }
            if (outPut instanceof Rectangle) {
                ((Rectangle) outPut).resize(20);
            }
            if (outPut instanceof Square) {
                ((Square) outPut).resize(20);
            }
        }
    }
}


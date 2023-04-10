package ss6_inheritance.exersice.point2D_point3D;

import java.util.Arrays;

public class WCheck {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D(2, 3);
        System.out.println(point2D1);
        point2D1.setXY(3, 4);
        point2D1.getXY();
        System.out.println(Arrays.toString(point2D1.getXY()));
        Point3D point3D1 = new Point3D(point2D1.getX(), point2D1.getY(),5);
        System.out.println(point3D1);
        point3D1.getXYZ();
        System.out.println(Arrays.toString(point3D1.getXYZ()));
    }
}

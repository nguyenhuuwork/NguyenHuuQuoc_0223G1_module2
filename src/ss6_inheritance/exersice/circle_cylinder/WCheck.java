package ss6_inheritance.exersice.circle_cylinder;

public class WCheck {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, "Red");
        Circle c2 = new Circle(5, "Yellow");
        System.out.println(c1);
        System.out.println(c2);
        Cylinder cy1 = new Cylinder(5, "Red", 5);
        Cylinder cy2 = new Cylinder(6, "Red", 4);
        System.out.println(cy1);
        System.out.println("Area: " + c1.areaCircle());
        cy2.areaCircle();
        System.out.println("Area: " + cy1.areaCircle());
        cy1.volumeCylinder();
        System.out.println("Volume: " + cy1.volumeCylinder());
        cy2.volumeCylinder();
        System.out.println("Volume: " + cy2.volumeCylinder());
        c1.areaCircle();
        System.out.println("Area: "+c1.areaCircle());
    }
}

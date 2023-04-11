package ss6_inheritance.exersice.point_moveable_point;

public class WCheck {
    public static void main(String[] args) {
        MovablePoint mova1 = new MovablePoint(1, 3, 4, 5);
        System.out.println(mova1.toString());
        System.out.println(mova1.move());
    }
}

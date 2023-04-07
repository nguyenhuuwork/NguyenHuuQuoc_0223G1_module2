package ss5_access_modifier_static_method_static_property.exersice.circle;

public class TestCircle {
    public static void main(String[] args) {
        AccessModifierCircle c = new AccessModifierCircle();
//        System.out.println(c.getArea());
//        c.getRadius();
//        System.out.println(c.getRadius());
//        c.setRadius(5);
//        System.out.println(c.getArea());
        c.getColor();
        System.out.println( c.getColor());
        c.setColor("Grey");
        System.out.println(c.getColor());
    }
}

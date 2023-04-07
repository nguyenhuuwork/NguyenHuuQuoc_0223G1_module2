package ss5_access_modifier_static_method_static_property.exersice.build_class_in_java;

public class TestBuildClass {
    public static void main(String[] args) {
        BuildClassInJava bc = new BuildClassInJava();
        bc.setName("Quoc");
        bc.getName();
        System.out.println(bc.getName());
        bc.setClasses("Kenvin De Quoc Bruyne");
        bc.getClasses();
        System.out.println(  bc.getClasses());
    }
}

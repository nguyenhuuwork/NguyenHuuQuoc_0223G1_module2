package ss4_class_oop_in_java.exersice.fan_class;

public class FanMain {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        FanClass fan2 = new FanClass();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
//        fan1.toString();
        System.out.println(fan1.toString());
        fan2.setSpeed(fan2.medium);
        fan2.setRadius(5);
        fan2.setColor("blue");
//        fan2.toString();
        System.out.println(fan2.toString());
    }
}

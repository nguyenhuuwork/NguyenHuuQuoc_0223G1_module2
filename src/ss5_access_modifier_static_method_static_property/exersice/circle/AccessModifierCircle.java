package ss5_access_modifier_static_method_static_property.exersice.circle;

public class AccessModifierCircle {
    private double radius = 2;
    private String color = "red";

    public AccessModifierCircle() {
    }

    public AccessModifierCircle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double ra1) {
        this.radius = ra1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color1) {
        this.color = color1;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}


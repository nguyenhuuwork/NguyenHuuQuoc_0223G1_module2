package ss6_inheritance.exersice.point_moveable_point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        return new float[]{super.getX(), super.getY()};
    }

    public MovablePoint move() {
        super.setX(super.getX() + getxSpeed());
        super.setY(super.getY() + getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + ")" + ",speed=(" + getxSpeed() + "," + getySpeed() + ")";

    }
}

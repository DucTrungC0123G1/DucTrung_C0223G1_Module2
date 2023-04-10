package ss6_inhertitance.bai_tap.point_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{super.getX(), super.getY()};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setX(xSpeed);
        setY(ySpeed);
    }

    public MovablePoint move() {
        super.setX(super.getX() + getxSpeed());
        super.setY(super.getY() + getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + super.toString() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

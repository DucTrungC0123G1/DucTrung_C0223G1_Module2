package ss4_oop.bai_tap.fan;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan is On , " + " " + "Speed : " + getSpeed() + " /" + " Radius :" + getRadius() + " " + " Color :" + getColor();

        } else {
            return "Fan is Off , " + " " + "Speed : " + getSpeed() + " /" + " Radius :" + getRadius() + " " + " Color :" + getColor();
        }
    }

}

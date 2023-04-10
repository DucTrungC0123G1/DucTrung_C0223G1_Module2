package ss6_inhertitance.bai_tap.point2d_3d;

public class Point3d extends Point2d {
    private float z;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.z};
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        setZ(z);

    }

    @Override
    public String toString() {
        return "Point3d{" + super.toString() +
                "z=" + z +
                '}';
    }
}

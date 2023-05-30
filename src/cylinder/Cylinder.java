package cylinder;

public class Cylinder extends Circle {
    //Instance variable
    private double height;

    public Cylinder(double radius, double h) {
        super(radius);
        if (height < 0) {
            h = 0;
        }
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}

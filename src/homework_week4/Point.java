package homework_week4;

/**
 * 16. Point
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 */

public class Point {
    int x;
    int y;

    // no-arg constructor
    public Point() {
        this.x = x;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // instance methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // method without parameters
    public double distance() {
        return distance(0, 0);
    }

    // returns distance between these points(x,y)
    public double distance(int x, int y) {

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    // returns distance between this point & another point
    public double distance(Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    // Main method
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}

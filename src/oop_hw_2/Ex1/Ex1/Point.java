package oop_hw_2.Ex1.Ex1;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        if (x >= 0)
            this.x = x;
    }

    public void setY(double y) {
        if (x >= 0)
            this.y = y;
    }
}

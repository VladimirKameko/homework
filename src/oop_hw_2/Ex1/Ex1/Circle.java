package oop_hw_2.Ex1.Ex1;


public class Circle {
    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double cirkleLenght() {
        return 2 * segmentLenght(getB(), getA()) * Math.PI;
    }

    public double area() {
        return Math.pow(segmentLenght(getB(), getA()), 2) * Math.PI;
    }

    private double segmentLenght(Point point2, Point point1) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + ((Math.pow(point2.getY() - point1.getY(), 2))));

    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }
}

package oop_hw3;

public class Circle extends Shape {
    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                "} ";
    }

    @Override
    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return segmentLenght(a, b);
    }
}

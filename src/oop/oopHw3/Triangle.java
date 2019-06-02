package oop.oopHw3;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimetr() / 2;
        return Math.sqrt(p * (p - segmentLenght(a, b)) * (p - segmentLenght(b, c)) * (p - segmentLenght(c, a)));
    }

    @Override
    public double getPerimetr() {
        return segmentLenght(a, b) + segmentLenght(b, c) + segmentLenght(c, a);
    }

    @Override
    public boolean isTreangle() {
        return true;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} ";
    }
}

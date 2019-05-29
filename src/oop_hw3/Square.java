package oop_hw3;

public class Square extends Shape implements GetDiagonals {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        return segmentLenght(a, b) * segmentLenght(b, c);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                "} ";
    }

    @Override
    public double getPerimetr() {
        return segmentLenght(a, b) * 4;
    }

    @Override
    public double firstDiag() {
        return segmentLenght(a, c);
    }

    @Override
    public double secondDiag() {
        return segmentLenght(b, d);
    }
}

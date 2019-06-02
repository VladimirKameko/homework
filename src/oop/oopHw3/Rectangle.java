package oop.oopHw3;

public class Rectangle extends Shape implements GetDiagonals {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        return segmentLenght(a, b) * segmentLenght(c, d);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                "} ";
    }

    @Override
    public double getPerimetr() {
        return (segmentLenght(a, b) + segmentLenght(c, d)) * 2;
    }

    @Override
    public boolean isRectangle() {
        return true;
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

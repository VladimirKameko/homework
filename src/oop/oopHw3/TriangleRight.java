package oop.oopHw3;

public class TriangleRight extends Triangle {
    private Point a;
    private Point b;
    private Point c;

    @Override
    public String toString() {
        return "TriangleRight{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} ";
    }

    public TriangleRight(Point a, Point b, Point c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (segmentLenght(a, c) * segmentLenght(b, c)) / 2;
    }
}

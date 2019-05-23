package oop_hw_2.Ex1;

class Circle {
    private Point a;
    private Point b;

    Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    Point getA() {
        return a;
    }

    Point getB() {
        return b;
    }

    void setA(Point a) {
        this.a = a;
    }

    void setB(Point b) {
        this.b = b;
    }

    private double segmentLenght(Point point2, Point point1) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + ((Math.pow(point2.getY() - point1.getY(), 2))));

    }

    double cirkleLenght() {
        return 2 * segmentLenght(getB(), getA()) * Math.PI;
    }

    double area() {
        return Math.pow(segmentLenght(getB(), getA()), 2) * Math.PI;
    }
}

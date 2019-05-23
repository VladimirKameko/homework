package oop_hw_2.Ex1;

class Rectangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    Point getPointA() {
        return pointA;
    }

    Point getPointB() {
        return pointB;
    }

    Point getPointC() {
        return pointC;
    }

    Point getPointD() {
        return pointD;
    }

    void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    private double segmentLenght(Point point2, Point point1) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + ((Math.pow(point2.getY() - point1.getY(), 2))));

    }

    double diagLength() {
        return segmentLenght(getPointC(), getPointA());

    }

    double area() {

        return segmentLenght(getPointB(), getPointA()) * segmentLenght(getPointC(), getPointB());

    }
}

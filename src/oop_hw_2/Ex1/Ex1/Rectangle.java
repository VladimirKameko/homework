package oop_hw_2.Ex1.Ex1;


public class Rectangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public double diagLength() {
        return segmentLenght(getPointC(), getPointA());

    }

    public double area() {

        return segmentLenght(getPointB(), getPointA()) * segmentLenght(getPointC(), getPointB());

    }

    private double segmentLenght(Point point2, Point point1) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + ((Math.pow(point2.getY() - point1.getY(), 2))));

    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }
}

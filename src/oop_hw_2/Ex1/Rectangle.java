package oop_hw_2.Ex1;

public class Rectangle {
    Point pointA;
    Point pointB;
    Point pointC;
    Point pointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public void setPoint(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPoint() {
        return pointA;
    }

    public double DiagLength(Point point1, Point point2) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + ((Math.pow(point2.getY() - point1.getY(), 2))));

    }

    public double area(Point point1, Point point2, Point point3) {

        return DiagLength(point2, point1) * DiagLength(point3, point2);

    }

}

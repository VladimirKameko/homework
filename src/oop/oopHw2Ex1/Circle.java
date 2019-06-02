package oop.oopHw2Ex1;


public class Circle implements GetArea {
    private Point a;
    private double rad;

    public Circle(Point a, double rad) {
        this.a = a;
        this.rad = rad;
    }

    public double cirkleLenght() {
        return 2 * rad * Math.PI;
    }


    @Override
    public double area() {
        return Math.pow(rad, 2) * Math.PI;
    }


    public Point getA() {
        return a;
    }


    public void setA(Point a) {
        this.a = a;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }
}

package oop_hw3;

public abstract class Shape {
    public static double segmentLenght(Point point2, Point point1) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + ((Math.pow(point2.getY() - point1.getY(), 2))));
    }

    public abstract double getArea();

    public boolean isAreaEquals(Shape shape) {
        return this.getArea() == shape.getArea();
    }

    public abstract double getPerimetr();

    public boolean isRectangle() {
        return false;
    }

    public boolean isTreangle() {
        return false;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

}

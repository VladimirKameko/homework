package oop_hw_2.Ex1;

class Point {

    private double x;
    private double y;

    Point(double x, double y) {
        setX(x);
        setY(y);
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void setX(double x) {
        if (x >= 0)
            this.x = x;
    }

    void setY(double y) {
        if (x >= 0)
            this.y = y;
    }
}

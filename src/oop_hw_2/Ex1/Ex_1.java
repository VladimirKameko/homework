package oop_hw_2.Ex1;

public class Ex_1 {
    public static void main(String[] args) {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(1, 3);
        Point pointC = new Point(4, 3);
        Point pointD = new Point(4, 1);
        Rectangle rec = new Rectangle(pointA, pointB, pointC, pointD);
        System.out.println(rec.DiagLength(pointA,pointC));
        System.out.println(rec.area(pointA,pointB,pointC));


    }
}

package oophw1.oopHw1Ex1;

import oophw1.oopHw1Ex1.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 =new Point(8,2);
        Point p2 =new Point(12,14);
        System.out.println(p1.distance(p2));
        Point p3 =new Point(3,4);
        p3.translate(1,3);
        p3.scale(2);
        System.out.println(p3);


    }


}

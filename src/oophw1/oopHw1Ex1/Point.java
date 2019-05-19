package oophw1.oopHw1Ex1;



public  final class  Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        if (x>=0)
        this.x = x;
    }

    public void setY(double y) {
        if(x>=0)
        this.y = y;
    }
    public double distance(Point point){
        double dis= Math.sqrt((Math.pow(point.getX()-getX(),2))+((Math.pow(point.getY()-getY(),2))));
        return dis;

    }
    public void translate(double x, double y){
        setX(getX()+x);
        setY(getY()+y);

    }
    public void scale(double sc){
        setX(getX()*sc);
        setY(getY()*sc);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

package oop.oopHw3;


public class TestRoom {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(1, 1), new Point(1, 3), new Point(3, 3), new Point(3, 1));
        Rhombus romb = new Rhombus(new Point(1, 1), new Point(2, 4), new Point(5, 4), new Point(4, 1));
        Square sqare = new Square(new Point(1, 1), new Point(1, 4), new Point(4, 4), new Point(4, 1));
        Triangle triangle = new Triangle(new Point(1, 1), new Point(4, 4), new Point(8, 1));
        TriangleRight triangleRight = new TriangleRight(new Point(1, 1), new Point(1, 4), new Point(4, 1));
        Circle circle = new Circle(new Point(4, 4), new Point(2, 2));


        // проверка методов прямоугольника
        System.out.println("Периметр " + rectangle.getPerimetr());
        System.out.println("Площадь " + rectangle.getArea());
        System.out.println("Диагональ " + rectangle.firstDiag());
        System.out.println(rectangle);
        System.out.println();


        // проверка методов ромба
        System.out.println("Периметр " + romb.getPerimetr());
        System.out.println("Площадь" + romb.getArea());
        System.out.println("Первая диагональ " + romb.firstDiag());
        System.out.println("Вторая диагональ " + romb.secondDiag());
        System.out.println(romb);
        System.out.println();

        //проверка методов квадрата
        System.out.println("Периметр " + sqare.getPerimetr());
        System.out.println("Площадь " + sqare.getArea());
        System.out.println("Диагональ " + sqare.firstDiag());
        System.out.println(sqare);
        System.out.println();

        //проверка методов треугольника
        System.out.println("Периметр " + triangle.getPerimetr());
        System.out.println("Площадь " + triangle.getArea());
        System.out.println(triangle);
        System.out.println();

        //проверка методов прямоугольного треугольника
        System.out.println("Периметр " + triangleRight.getPerimetr());
        System.out.println("Площадь " + triangleRight.getArea());
        System.out.println(triangleRight);
        System.out.println();

        //проверка методов круга
        System.out.println("Периметр " + circle.getPerimetr());
        System.out.println("Площадь " + circle.getArea());
        System.out.println("Радиус " + circle.getRadius());
        System.out.println(sqare);
        System.out.println();

        //проверка класса ShapeUtils
        System.out.println(ShapeUtils.isRectangle(romb));
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isTriangle(rectangle));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println();

        //проверка является ли фигура треугольником или прямоугольником
        System.out.println(triangle.isTreangle());
        System.out.println(circle.isTreangle());
        System.out.println(rectangle.isTreangle());
        System.out.println(rectangle.isRectangle());
        System.out.println();

        //проверка равенства площади фигур
        System.out.println(triangle.isAreaEquals(circle));
        System.out.println(circle.isAreaEquals(new Circle(new Point(6, 6), new Point(4, 4))));
    }
}

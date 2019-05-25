package oop_hw_2.Ex1.Ex1;
/*Продолжение задачи 1. Используя класс точки, создать класс Rectangle, описывающий прямоугольник, и класс Circle
 описывающий круг. В них должны храниться поля типа Point в роли координат.
Создать следующие методы в классе Rectangle:
- Высчитывающий длину диагонали
Методы в классе Circle:
- Высчитывающий длину окружности. У обоих классов должен быть метод нахождения площади. Написать программу,
 тестовый класс с методом main, демонстрирующим создание объекта класса Rectangle и применение
  вышеперечисленных методов.
 */


public class Ex_1 {
    public static void main(String[] args) {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(1, 3);
        Point pointC = new Point(4, 3);
        Point pointD = new Point(4, 1);
        Rectangle rec = new Rectangle(pointA, pointB, pointC, pointD);
        Point O1 = new Point(4, 4);
        Point O2 = new Point(8, 8);
        Circle c = new Circle(O1, O2);
        System.out.println(rec.diagLength());
        System.out.println(rec.area());
        System.out.println(c.area());

    }
}

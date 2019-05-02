package hw_1;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите аргументы квадратного уравнения a,b и c");
        double q = scan.nextDouble();
        double w = scan.nextDouble();
        double e = scan.nextDouble();
        if (discriminant(q, w, e) < 0)
            System.out.println("Уравнение не имеет действительных корней!");
        else if (discriminant(q, w, e) == 0) {
            isZero(q, w);
        } else
            izPositiv(discriminant(q, w, e), q, w);
    }

    private static double discriminant(double a, double b, double c) {


        return b * b - 4 * a * c;
    }

    private static void isZero(double a, double b) {

        double x = -b / (2 * a);
        System.out.println("Уравнение имеет единственный корень: x = " + x);


    }

    private static void izPositiv(double d, double a, double b) {
        if (d > 0) {
            double x1, x2;
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }

    }
}
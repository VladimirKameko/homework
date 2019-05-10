package hw_1;

import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите корни уравнения");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        calculation(a, b, c);
    }

    public static void calculation(double a, double b, double c) {
        if (isPositiv(discriminant(a, b, c))) {
            double x1 = ((-b - Math.sqrt(discriminant(a, b, c))) / (2 * a));
            double x2 = ((-b + Math.sqrt(discriminant(a, b, c))) / (2 * a));
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            System.out.println(discriminant(a, b, c));
        } else if (isZero(discriminant(a, b, c))) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }

    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static boolean isPositiv(double d) {
        if (d > 0) {
            return true;
        }
        return false;
    }

    public static boolean isZero(double d) {
        if (d == 0) {
            return true;
        }
        return false;
    }

}
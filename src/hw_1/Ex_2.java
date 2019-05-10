package hw_1;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размери первого дома");
        double p = scan.nextDouble();
        double q = scan.nextDouble();
        System.out.println("Введите размери второго дома");
        double r = scan.nextDouble();
        double s = scan.nextDouble();
        double e = 20, f = 30;
        if ((e >= p && e >= r && f >= (q + s)) ||
                (e >= q && e >= r && f >= (p + s)) ||
                (e >= p && e >= s && f >= (q + r)) ||
                (e >= q && e >= s && f >= (p + r)) ||
                (f >= p && f >= r && e >= (q + s)) ||
                (f >= q && f >= r && e >= (p + s)) ||
                (f >= p && f >= s && e >= (q + r)) ||
                (f >= q && f >= s && e >= (p + r))) {
            System.out.println("Здания помещаются");

        } else
            System.out.println("здания не помещаются");
    }
}


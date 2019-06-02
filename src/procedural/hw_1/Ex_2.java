package procedural.hw_1;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размери первого дома");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Введите размери второго дома");
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = 20, f = 30;
        checkBildings(a,b,c,d,e,f);
    }

   private static void checkBildings(double a, double b, double c, double d, double e, double f) {
        if (diag(a, b, c, d, e, f)) {
            System.out.println("Здания помещаются");
        } else if (((a + c) <= e) && (b <= f) && (d <= f)) {
            System.out.println("Здания помещаются");
        } else if (((b + d) <= f) && (a <= e) && (c <= e)) {
            System.out.println("Здания помещаются");
        } else {
            System.out.println("здания не помещаются");
        }

    }

    private static boolean diag(double a, double b, double c, double d, double e, double f) {
        boolean u = false;
        double diag1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double diag2 = Math.sqrt(Math.pow(c, 2) + Math.pow(d, 2));
        double diag3 = Math.sqrt(Math.pow(e, 2) + Math.pow(f, 2));
        if ((diag1 + diag2) <= diag3) {
            u = true;
        }
        return u;

    }
}


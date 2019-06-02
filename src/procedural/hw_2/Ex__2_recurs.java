package procedural.hw_2;

import java.util.Scanner;

public class Ex__2_recurs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int inputNumber = s.nextInt();
        int n = 1;
        int fib = recursionFibonachi(n);
        while (fib < inputNumber) {
            System.out.print(fib + " ");
            fib = recursionFibonachi(++n);
        }
    }

    static int recursionFibonachi(int n) {
        return n < 3 ? 1 : recursionFibonachi(n - 1) + recursionFibonachi(n - 2);
    }
}

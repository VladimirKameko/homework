package hw_2;

import java.util.Scanner;

public class Ex__1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }
}

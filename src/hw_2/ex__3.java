package hw_2;

import java.util.Scanner;

public class ex__3 {
    public static void main(String[] args) {
        double sum = 0;
        double average = 0.0;
        double dayMax = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int days = scan.nextInt();
        for (int i = 1; i < days + 1; i++) {
            System.out.println("Введите количество осадков за " + i + "-й день");
            double a = scan.nextDouble();
            sum += a;
            average = sum / i;
            if (a > dayMax)
                dayMax = a;
        }
        System.out.println("количество дней: " + days + "\nсумма осадков: " + sum + "\nсреднее количество: " + average + "\nмаксимальное количество:" + dayMax);

    }
}

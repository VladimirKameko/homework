package hw_1;

import java.util.Scanner;

public class ex_1 {
   private static void plusDay(int day, int month, int year) {


        if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;

        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;

        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;

        } else {
            day++;

        }
        System.out.println("стало :" + day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите день");
        int day = scan.nextInt();
        System.out.println("Введите месяц");
        int month = scan.nextInt();
        System.out.println("Введите год");
        int year = scan.nextInt();
        System.out.println("было :" + day + "/" + month + "/" + year);

        plusDay(day, month, year);
    }
}

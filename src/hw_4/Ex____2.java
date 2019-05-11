package hw_4;

import java.util.Scanner;

public class Ex____2 {
    private static int checkNum(String str) {
        int num = 0;
        String f = " ";
        str = str + f;
        char s;
        int lf = str.length();
        for (int i = 0; i < lf - 1; ++i) {

            if ((findNum(str.charAt(i)) < findNum(str.charAt(i + 1)))) {
                num += findNum(str.charAt(i + 1)) - findNum(str.charAt(i));
                i++;

            } else {
                num += findNum(str.charAt(i));
            }
        }
        return num;


    }

    private static int findNum(char s) {
        int dec = 0;
        switch (s) {
            case 'M':
                dec += 1000;
                break;

            case 'D':
                dec += 500;
                break;

            case 'C':
                dec += 100;
                break;

            case 'L':
                dec += 50;
                break;

            case 'X':
                dec += 10;
                break;

            case 'V':
                dec += 5;
                break;

            case 'I':
                dec += 1;
                break;
            case ' ':
                dec += 0;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в римском формате");
        String str = scan.nextLine();
        System.out.println(checkNum(str));
    }
}

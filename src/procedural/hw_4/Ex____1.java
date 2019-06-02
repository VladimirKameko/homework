package procedural.hw_4;

import java.util.Scanner;


public class Ex____1 {
    private static boolean findPolindrom(String str) {
        int n = str.length();
        boolean a=false;
        for (int i = 0; i < (n / 2); i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                a = false;
            } else {
                a = true;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scan.nextLine();
        System.out.println(findPolindrom(str));
    }
}

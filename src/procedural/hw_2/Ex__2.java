package procedural.hw_2;

import java.util.Scanner;

public class Ex__2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int lim = scan.nextInt();
        int n0 = 1, n1 = 1, n2;
        int[] a = new int[lim];
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i < lim; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }


    }
}

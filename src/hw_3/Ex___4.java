package hw_3;


import java.util.Arrays;
import java.util.Scanner;

public class Ex___4 {
    private static void arrayCreate(int[][] array, int a, int b) {
        int[] array1 = new int[a * b];
        int q = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array1[q] = array[i][j];
                q++;
            }
        }
        System.out.println(Arrays.toString(array1));


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int lines = scan.nextInt();
        System.out.println("Введите количество столбцов массива");
        int columns = scan.nextInt();
        int[][] twoDimArray = new int[lines][columns];
        System.out.println("Введите элемены массива");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimArray[i][j] = scan.nextInt();
            }
        }
        arrayCreate(twoDimArray, lines, columns);

    }
}

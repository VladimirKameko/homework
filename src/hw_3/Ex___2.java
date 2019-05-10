package hw_3;

import java.util.Arrays;

public class Ex___2 {
    public static void main(String[] args) {
        int[] array = {2, 3, 3, 4, 5, 2, 2, 2};
        boolean[] mask = new boolean[array.length];


        int count = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (!mask[i]) {
                temp = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (temp == array[j]) {
                        mask[j] = true;
                        count++;
                    }
                }
            }
        }
        int[] arrayNew = new int[array.length - count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (!mask[i]) {
                arrayNew[j++] = array[i];
            }
        }
        System.out.println("Было " + Arrays.toString(array));
        System.out.println("Стало " + Arrays.toString(arrayNew));
    }

}








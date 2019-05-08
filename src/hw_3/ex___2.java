package hw_3;

import java.util.Arrays;

public class ex___2 {
    public static void main(String[] args) {
        int count = 0;
        int tmp = 0;
        int[] array = {12, 12, 0, -1, 4, -1, 0, 12, 6};
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    count++;
                }
            }
        }
        int[] arrayNew = new int[array.length - count];
        for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i] = array[i];
        }
        System.out.println(Arrays.toString(arrayNew));


        System.out.println((count));

    }

}








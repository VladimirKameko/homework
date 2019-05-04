package hw_3;

import java.util.Arrays;

public class ex___2 {
    public static void main(String[] args) {
        int count = 0;
        int[] array = {2, 3, 3, 5};
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]) {

                i++;
                count++;
            }
        }
        int[] array1 = new int[array.length - count];
        System.out.println(array.length);
        int ch = array.length;
        int k = 0;
        for (int j = 0; j < ch; j++) {
            array1[k] = array[j];
            if (array[j] == array[j + 1]) {
                j++;

            }
            if (array1.length==array[k])
                break;
            k++;


        }

        System.out.println(count);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }

}








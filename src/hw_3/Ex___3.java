package hw_3;


import java.util.Arrays;

public class Ex___3 {
    private static int[] sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }
            }
        }
        return array;
    }

    private static void arrayCreate(int array1[], int array2[]) {
        int[] array3 = new int[array1.length + array2.length];
        int max = Math.max(array1.length, array2.length);

        for (int i = 0, p = 0; i != max; i++) {
            if (i < array1.length)
                array3[p++] = array1[i];
            if (i < array2.length)
                array3[p++] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(sortArray(array3)));
    }

    public static void main(String[] args) {
        int[] array1 = {2, 1, 7, 9, 12};
        int[] array2 = {1, 2, 3, 4, 5, 6, 5, 6, 4, 3};
        arrayCreate(array1, array2);

    }

}

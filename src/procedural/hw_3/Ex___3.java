package procedural.hw_3;


import java.util.Arrays;

public class Ex___3 {
    private static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    private static int[] arrayCreate(int array1[], int array2[]) {
        int[] array3 = new int[array1.length + array2.length];
        int max = Math.max(array1.length, array2.length);

        for (int i = 0, p = 0; i != max; i++) {
            if (i < array1.length)
                array3[p++] = array1[i];
            if (i < array2.length)
                array3[p++] = array2[i];
        }
        sortArray(array3);
        return array3;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 1, 7, 9, 12};
        int[] array2 = {1, 2, 3, 4, 5, 6, 5, 6, 4, 3};
        System.out.println(Arrays.toString(arrayCreate(array1, array2)));
    }
}

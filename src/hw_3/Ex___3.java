package hw_3;


import java.util.Arrays;

public class Ex___3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6,5,6,4,3};
        int[] array3 = new int[array1.length + array2.length];
        int max = Math.max(array1.length, array2.length);


        for (int i = 0, p = 0; i != max; i++) {
            if (i < array1.length)
                array3[p++] = array1[i];
            if (i < array2.length)
                array3[p++] = array2[i];
        }


        System.out.println(Arrays.toString(array3));
    }

}

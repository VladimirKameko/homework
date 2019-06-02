package procedural.hw_3;

import java.util.Arrays;

public class Ex___1 {
    public static int[] newArrayCrate(int[] array, int positions){
        int size = array.length;

        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];

            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positions = 1;

        System.out.println(Arrays.toString(newArrayCrate(array, positions)));
    }
}

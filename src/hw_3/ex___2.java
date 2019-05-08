package hw_3;

import java.util.Arrays;

public class ex___2 {
    public static void main(String[] args) {
        int[] array = {2,3,3,4,5,2,2,2};
        boolean[] mask = new boolean[array.length];
        System.out.println(Arrays.toString(mask));

        int count=0;
        int temp=0;
        for(int i=0;i<array.length;i++){
            if(!mask[i]){
                temp =array[i];
                    for(int j=i+1;j<array.length;j++){
                        if(temp==array[j]){
                            mask[j]=true;
                            count++;
                        }
                    }
            }
        }
        int[] arrayNew = new int[array.length-count];
        for(int i=0,j=0;i<array.length;i++){
            if(!mask[i]){
                arrayNew[j++]=array[i];
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mask));
        System.out.println(Arrays.toString(arrayNew));
    }

}








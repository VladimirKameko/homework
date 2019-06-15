package Exceptions.Ex2;

import static Exceptions.Ex2.DoubleSum.sumOfValues;

public class Ex2 {
    public static void main(String[] args) throws NumberFormatException {
        try {
            System.out.println(sumOfValues());
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}

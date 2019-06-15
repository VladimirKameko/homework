package Exceptions.Ex2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleSum {
    public static List<Double> readValues() throws NumberFormatException {
        List<Double> listDoubls = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while ((i < 5) && (scan.hasNext())) {
            listDoubls.add(scan.nextDouble());
            i++;
        }
        return listDoubls;
    }

    public static double sumOfValues() throws NumberFormatException {
        double sum = 0;
        for (double number : readValues()) {
            sum += number;
        }
        return sum;
    }
}

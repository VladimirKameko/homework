package Exceptions.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleInput {
    public List<Double> readValues() throws NumberFormatException {
        List<Double> listDoubls = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        try {
            while ((i < 5) && (scan.hasNext())) {
                listDoubls.add(scan.nextDouble());
                i++;
            }
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        return listDoubls;
    }
}

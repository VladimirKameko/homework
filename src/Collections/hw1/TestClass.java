package Collections.hw1;



import static java.util.Arrays.asList;

public class TestClass {
    public static void main(String[] args) {
       for(Integer max: new PairMaxIterable(asList(new Pair(6,2), new Pair(3,2), new Pair(1,5)))){
           System.out.println(max+" ");
       }
    }


}

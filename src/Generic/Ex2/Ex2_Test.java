package Generic.Ex2;


public class Ex2_Test {
    public static void main(String[] args) {


        PairMaxMin<Integer> pair = new PairMaxMin<>(14, 5);
        System.out.println(pair.min());
        System.out.println(pair.maks());
    }
}

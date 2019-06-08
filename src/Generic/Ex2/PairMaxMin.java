package Generic.Ex2;


public class PairMaxMin<E extends Comparable> {
    private E e1;
    private E e2;

    public PairMaxMin(E e1, E e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public E getE1() {
        return e1;
    }

    public E getE2() {
        return e2;
    }

    @SuppressWarnings("unchecked")
    public E Maks() {
        return (getE1().compareTo(getE2())) > 0 ? getE1() : getE2();

    }
    @SuppressWarnings("unchecked")
    public E Min() {
        return (getE1().compareTo(getE2())) < 0 ? getE1() : getE2();

    }

}

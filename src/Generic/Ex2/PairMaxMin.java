package Generic.Ex2;


public class PairMaxMin<E extends Comparable<E>> {
    private E fst;
    private E snd;

    public PairMaxMin(E e1, E e2) {
        this.fst = e1;
        this.snd = e2;
    }

    public E getFst() {
        return fst;
    }

    public E getSnd() {
        return snd;
    }


    public E Maks() {
        return (getFst().compareTo(getSnd())) > 0 ? getFst() : getSnd();

    }

    public E Min() {
        return (getFst().compareTo(getSnd())) < 0 ? getFst() : getSnd();

    }

}

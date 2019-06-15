package Collections.hw1;

public class Pair<E> {
    private E fst;
    private E snd;

    public void setFst(E fst) {
        this.fst = fst;
    }

    public void setSnd(E snd) {
        this.snd = snd;
    }

    public E getFst() {
        return fst;
    }

    public E getSnd() {
        return snd;
    }

    public Pair(E fst, E snd) {
        this.fst = fst;
        this.snd = snd;
    }
}

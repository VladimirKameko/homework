package Collections.hw1;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterator<E extends Comparable<E>> implements Iterator<E> {
    private List<Pair<E>> list;
    private int count = 0;

    public PairMaxIterator(List<Pair<E>> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    @Override
    public E next() {
        return list.get(count++).maks();
    }
}

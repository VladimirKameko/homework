package Collections.hw1;

import Collections.hw1.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PairListIterable<E extends Comparable<E>> implements Iterator<E> {
    List<Pair<E>> entryList = new ArrayList<>();
    int count=0;

    public PairListIterable(List<Pair<E>> entryList) {
        this.entryList = entryList;
    }


    @Override
    public boolean hasNext() {
        return count<entryList.size();
    }

    @Override
    public E next() {
    //    return entryList.get();
        return null;
    }
}

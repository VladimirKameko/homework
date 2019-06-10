package Generic.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Table<K, V> {
    private List<Entry<K, V>> entryList = new ArrayList<>();


    public void add(Entry<K, V> entry) {
        entryList.add(entry);
    }


    public V getValue(K key) {

        for (Entry<K, V> entry : entryList) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;

    }

    public boolean addValue(K key, V value) {
        for (Entry<K, V> entry : entryList) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return true;
            }
        }
        return false;
    }

    public boolean remove(K key) {
        ListIterator<Entry<K, V>> entryIterator = entryList.listIterator();
        while (entryIterator.hasNext()) {
            if (entryIterator.next().getKey().equals(key)) {
                entryIterator.remove();
                return true;
            }
        }
        return false;
    }


    public List<Entry<K, V>> getList() {
        return entryList;
    }
}

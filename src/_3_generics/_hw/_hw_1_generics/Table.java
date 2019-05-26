/**
 *    *** Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
 *        состоящим из элементов типа Entry<K, V>. Предоставьте методы для получения значения,
 *        связанного с ключом, установки значения по заданному ключу и удаления ключа.
 */

package _3_generics._hw._hw_1_generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table<K, V> {

    private final List<Entry<K, V>> entryList;

    public Table() {
        entryList = new ArrayList<>();
    }

    public Table(List<Entry<K, V>> entries) {
        this.entryList = entries;
    }

    @SuppressWarnings("unchecked")
    public List<V> getValue(K key) {
        List<V> values = new ArrayList<>();
        for (Entry entry : entryList) {
            if (entry.getKey().equals(key)) {
                values.add((V) entry.getValue());
            }
        }
        return values;
    }

    @SuppressWarnings("unchecked")
    public boolean addValue(K key, V value) {
        for (Entry entry : entryList) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return true;
            }
        }
        return false;
    }

    public boolean remove(K key) {
        Iterator<Entry<K, V>> entryIterator = entryList.iterator();
        while (entryIterator.hasNext()) {
            Entry entry = entryIterator.next();
            if (entry.getKey().equals(key)) {
                entryList.remove(entry);
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public void add(Entry entry) {
        entryList.add(entry);
    }

    public List<Entry<K, V>> getEntryList() {
        return entryList;
    }
}
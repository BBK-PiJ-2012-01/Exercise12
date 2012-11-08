package Map;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 23:29
 */
public class EntryImpl<K, V> implements Entry<K, V> {
    private final K key;
    private V value;
    private Entry<K, V> next;
    private int hash;

    public EntryImpl(K key) {
        this.key = key;
        hash = Math.abs(key.hashCode());
    }

    @Override
    public int getHash() {
        return hash;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public Entry<K, V> getNext() {
        return next;
    }

    @Override
    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}

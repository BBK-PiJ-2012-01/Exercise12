package Map;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 22:39
 */
public interface Entry<K, V> {
    int getHash();
    K getKey();
    V getValue();
    void setValue(V value);

    Entry<K, V> getNext();
    void setNext(Entry<K, V> next);
}

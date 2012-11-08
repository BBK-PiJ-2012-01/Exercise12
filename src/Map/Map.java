package Map;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 22:37
 */
public interface Map<K, V> {
    void put(K key, V value);
    V get(K key);
    void delete(K key);
}

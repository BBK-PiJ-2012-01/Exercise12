package Map;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 23:19
 */
public interface MultiValueMap <K, V> {
    void put(K key, V value);
    List<V> get(K key);
    void delete(K key, V value);
    void delete(K key);
}

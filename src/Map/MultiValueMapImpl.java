package Map;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 08/11/2012
 * Time: 00:09
 */
public class MultiValueMapImpl<K, V>  implements MultiValueMap<K, V> {
    @Override
    public void put(K key, V value) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public List<V> get(K key) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void delete(K key, V value) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void delete(K key) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

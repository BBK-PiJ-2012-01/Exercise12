package Map;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 08/11/2012
 * Time: 00:09
 */
public class MultiValueMapImpl<K, V>  implements MultiValueMap<K, V> {
    private HashMap<K, List<V>> map = new HashMap<K, List<V>>();

    @Override
    public void put(K key, V value) {
        get(key).add(value);
    }

    @Override
    public List<V> get(K key) {
        List<V> value_lst = map.get(key);
        if (value_lst == null) {
            value_lst = new LinkedList<V>();
            map.put(key, value_lst);
        }
        return value_lst;
    }

    @Override
    public void delete(K key, V value) {
        try {
            get(key).remove(value);
        } catch (NullPointerException err) {}
    }

    @Override
    public void deleteAll(K key, V value) {
        ListIterator<V> itr;
        try {
            itr = get(key).listIterator();
        } catch (NullPointerException err) {
            return;
        }

        while (itr.hasNext()) {
            if (itr.next().equals(value))
                itr.remove();
        }
    }

    @Override
    public void delete(K key) {
        List<V> value_lst = map.get(key);
        if (value_lst != null) {
            value_lst.clear();
        }
    }
}

package Map;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 23:20
 */
public class HashMap<K, V> implements Map<K, V> {
    private static final int initial_bucket_size = 100;
    private int bucket_size = initial_bucket_size;
    private Entry<K, V>[] buckets = new Entry[bucket_size];

    @Override
    public void put(K key, V value) {
        Entry<K, V> new_entry = new EntryImpl<K, V>(key);
        new_entry.setValue(value);

        int bucket_index = new_entry.getHash() % bucket_size;
        new_entry.setNext(buckets[bucket_index]);
        buckets[bucket_index] = new_entry;
    }

    @Override
    public V get(K key) {
        int key_hash = Math.abs(key.hashCode());
        Entry<K, V> test_entry = buckets[key_hash % bucket_size];
        while(test_entry != null) {
            if (test_entry.getHash() == key_hash && test_entry.getKey().equals(key)) {
                return test_entry.getValue();
            }
            test_entry = test_entry.getNext();
        }
        return null;
    }

    @Override
    public void delete(K key) {
        int key_hash = Math.abs(key.hashCode());
        int bucket_index = key_hash % bucket_size;
        Entry<K, V> prev_entry = null, test_entry = buckets[bucket_index];
        while(test_entry != null) {
            if (test_entry.getHash() == key_hash && test_entry.getKey().equals(key)) {
                if (prev_entry != null)
                    prev_entry.setNext(test_entry.getNext());
                else
                    buckets[bucket_index] = test_entry.getNext();
            }
            prev_entry = test_entry;
            test_entry = test_entry.getNext();
        }
    }
}

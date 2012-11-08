package Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 23:30
 */
public class EntryImplTest {
    private Entry<Integer, String> entry;
    Integer expected_key = 5;

    @Before
    public void buildUp() {
        entry = new EntryImpl<Integer, String>(expected_key);
    }

    @Test
    public void testGetKey() throws Exception {
        assertEquals(expected_key, entry.getKey());
    }

    @Test
    public void testGetHash() {
        assertEquals(expected_key.hashCode(), entry.getHash());
    }

    @Test
    public void testGetValue() throws Exception {
        entry.setValue("Expected");
        assertEquals("Expected", entry.getValue());
    }

    @Test
    public void testGetNext() throws Exception {
        assertNull(entry.getNext());
    }

    @Test
    public void testSetNext() throws Exception {
        Entry<Integer, String> next_entry = new EntryImpl<Integer, String>(6);
        entry.setNext(next_entry);
        assertEquals(next_entry, entry.getNext());
        assertNull(next_entry.getNext());
    }
}

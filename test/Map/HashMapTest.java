package Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 23:20
 */
public class HashMapTest {
    private Map<String, Integer> map;

    @Before
    public void setUp() throws Exception {
        map = new HashMap<String, Integer>();
    }

    @Test
    public void testPut() throws Exception {
        map.put("One", 1);
        map.put("Two", 2);

        assertEquals((Integer) 1, map.get("One"));
        assertEquals((Integer) 2, map.get("Two"));
        assertNull(map.get("Not there"));
    }

    @Test
    public void testDelete() throws Exception {
        map.put("One", 1);
        map.delete("One");
        assertNull(map.get("One"));
    }

    @Test
    public void testUnusedKey() throws Exception {
        assertNull(map.get("Unused"));
        map.delete("Unused");
        assertNull(map.get("Unused"));
    }
}

package Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 08/11/2012
 * Time: 00:12
 */
public class MultiValueMapImplTest {
    private MultiValueMap<Integer, String> map;

    @Before
    public void setUp() throws Exception {
        map = new MultiValueMapImpl<Integer, String>();
    }

    @Test
    public void testPut() throws Exception {
        map.put(1, "1-1");
        map.put(1, "1-2");
        map.put(2, "2");

        assertEquals("1-1", map.get(1).get(0));
        assertEquals("1-2", map.get(1).get(1));
        assertEquals("2", map.get(2).get(0));

        assertEquals(2, map.get(1).size());
        assertEquals(2, map.get(1).size());
        assertEquals(1, map.get(2).size());

    }

    @Test
    public void testDeleteKey() throws Exception {
        map.put(1, "1-1");
        map.put(1, "1-2");
        map.put(2, "2");

        map.delete(1);
        map.delete(2);
        assertEquals(0, map.get(1).size());
        assertEquals(0, map.get(2).size());
    }

    @Test
    public void testDeleteEntry() throws Exception {
        map.put(1, "1-1");
        map.put(1, "1-1");
        map.put(1, "1-2");
        map.put(2, "2");

        map.delete(2, "2");
        assertEquals(0, map.get(2).size());
    }

    @Test
    public void testDeleteAllEntries() throws Exception {
        map.put(1, "1-1");
        map.put(1, "1-1");
        map.put(1, "1-2");
        map.put(2, "2");

        assertEquals(3, map.get(1).size());
        map.deleteAll(1, "1-1");
        assertEquals(1, map.get(1).size());
        assertEquals("1-2", map.get(1).get(0));

        assertEquals(1, map.get(2).size());
        map.deleteAll(2, "2");
        assertEquals(0, map.get(2).size());
    }

    @Test
    public void testDeleteFirstEntry() throws Exception {
        map.put(1, "1-1");
        map.put(1, "1-1");
        map.put(1, "1-2");
        map.put(2, "2");

        assertEquals(3, map.get(1).size());
        map.delete(1, "1-1");
        assertEquals(2, map.get(1).size());
        assertEquals("1-1", map.get(1).get(0));
        assertEquals("1-2", map.get(1).get(1));

        assertEquals(1, map.get(2).size());
        map.delete(2, "2");
        assertEquals(0, map.get(2).size());
    }

    @Test
    public void testGetUnusedKey() {
        assertEquals(0, map.get(3).size());
    }

}

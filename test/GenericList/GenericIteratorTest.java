package GenericList;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:55
 */
public class GenericIteratorTest {
    private Iterator<Integer> itr;
    private Element<Integer> first;

    @Before
    public void setUp() throws Exception {
        Element<Integer> e1 = new ElementImpl(1);
        Element<Integer> e2 = new ElementImpl(2);
        Element<Integer> e3 = new ElementImpl(3);

        e1.setNext(e2);
        e2.setNext(e3);

        first = e1;

        itr = new GenericIterator<Integer>(first);
    }

    @Test
    public void testNext() {
        assertTrue(itr.hasNext());
        assertEquals((Integer) 1, itr.next());
        assertTrue(itr.hasNext());
        assertEquals((Integer) 2, itr.next());
        assertTrue(itr.hasNext());
        assertEquals((Integer) 3, itr.next());
        assertFalse(itr.hasNext());
    }

    @Test
    public void testRemove() throws Exception {
        assertTrue(itr.hasNext());
        assertEquals((Integer) 1, itr.next());
        assertTrue(itr.hasNext());
        assertEquals((Integer) 2, itr.next());

        itr.remove();

        assertTrue(itr.hasNext());
        assertEquals((Integer) 3, itr.next());
        assertFalse(itr.hasNext());

        itr = new GenericIterator<Integer>(first);

        assertTrue(itr.hasNext());
        assertEquals((Integer) 1, itr.next());
        assertTrue(itr.hasNext());
        assertEquals((Integer) 3, itr.next());
        assertFalse(itr.hasNext());
    }
}

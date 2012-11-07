package GenericList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:28
 */
public class ElementImplTest {
    @Test
    public void testGetValue() {
        Element<Integer> e1 = new ElementImpl(1);
        assertEquals((Integer) 1, e1.getValue());
    }

    @Test
    public void testSetNext() throws Exception {
        Element<Integer> e1 = new ElementImpl(1);
        Element<Integer> e2 = new ElementImpl(2);
        Element<Integer> e3 = new ElementImpl(3);

        e1.setNext(e2);
        e2.setNext(e3);

        testOrder(e1, e2, e3);
    }

    private void testOrder(Element<Integer> e1, Element<Integer> e2, Element<Integer> e3) {
        assertNull(e1.getPrev());
        assertEquals(e2, e1.getNext());
        assertEquals(e1, e2.getPrev());
        assertEquals(e3, e2.getNext());
        assertEquals(e2, e3.getPrev());
        assertNull(e3.getNext());
    }

    @Test
    public void testSetPrev() throws Exception {
        Element<Integer> e1 = new ElementImpl(1);
        Element<Integer> e2 = new ElementImpl(2);
        Element<Integer> e3 = new ElementImpl(3);

        e2.setPrev(e1);
        e3.setPrev(e2);

        testOrder(e1, e2, e3);
    }
}

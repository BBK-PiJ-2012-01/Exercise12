package NumberStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 21:46
 */
public class StackElementImplTest {
    StackElement<Integer> element;
    Integer expected_value = 5;

    @Before
    public void buildUp() {
        element = new StackElementImpl<Integer>(expected_value);
    }

    @Test
    public void testSetNext() throws Exception {
        StackElement<Integer> next_element = new StackElementImpl<Integer>(6);
        element.setNext(next_element);
        assertEquals(next_element, element.getNext());
    }

    @Test
    public void testGetNext() throws Exception {
        assertNull(element.getNext());
    }

    @Test
    public void testGetValue() throws Exception {
        assertEquals(expected_value, element.getValue());
    }
}

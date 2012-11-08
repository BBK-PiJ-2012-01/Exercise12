package NumberStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 21:51
 */
public class NumberStackImplTest {
    NumberStack<Integer> stack;

    @Before
    public void buildUp() {
        stack = new NumberStackImpl<Integer>();
    }

    @Test
    public void testPush() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals((Integer) 3, stack.pop());
        assertEquals((Integer) 2, stack.pop());
        assertEquals((Integer) 1, stack.pop());
        assertNull(stack.pop());

    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());

        stack.push(2);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }
}

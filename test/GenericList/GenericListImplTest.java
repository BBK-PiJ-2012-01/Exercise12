package GenericList;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:13
 */
public class GenericListImplTest {
    private GenericList<Integer> lst;

    @Before
    public void buildUp() {
        lst = new GenericListImpl<Integer>();
    }

    @Test
    public void testAddEnd() {
        lst.addEnd(1);
        lst.addEnd(2);
        lst.addEnd(3);

        assertEquals((Integer) 3, lst.popEnd());
        assertEquals((Integer) 1, lst.popStart());
        assertEquals((Integer) 2, lst.popEnd());
    }

    @Test
    public void testAddStart() {
        lst.addStart(1);
        lst.addStart(2);
        lst.addStart(3);

        assertEquals((Integer) 1, lst.popEnd());
        assertEquals((Integer) 3, lst.popStart());
        assertEquals((Integer) 2, lst.popEnd());
    }

    @Test
    public void testIterator() {
        List<Integer> inbuilt_lst = new LinkedList<Integer>();

        lst.addEnd(1);
        lst.addEnd(2);
        lst.addEnd(3);

        for (int val : lst) {
            inbuilt_lst.add(val);
        }

        assertArrayEquals(new Integer[]{1,2,3}, inbuilt_lst.toArray(new Integer[0]));
    }
}

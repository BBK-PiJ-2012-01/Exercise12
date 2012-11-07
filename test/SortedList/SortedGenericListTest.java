package SortedList;

import GenericList.GenericList;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 16:52
 */
public class SortedGenericListTest {
    @Test
    public void testAdd() throws Exception {
        GenericList<Integer> lst = new SortedGenericList<Integer>();
        List<Integer> inbuilt_lst = new LinkedList<Integer>();

        lst.add(3);
        lst.add(1);
        lst.add(2);

        for (int val : lst) {
            System.out.println(" found " + val);
            inbuilt_lst.add(val);
        }

        assertArrayEquals(new Integer[]{1,2,3}, inbuilt_lst.toArray(new Integer[0]));
    }
}

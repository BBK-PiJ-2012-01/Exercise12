package DRY;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 13:52
 */
public class EfficientComparatorTest {
    EfficientComparator comp;

    @Before
    public void buildUp() {
        comp = new EfficientComparator();
    }

    @Test
    public void testIntComparison() {
        System.out.println("Testing int comparison");
        assertEquals(3, (int) comp.getMax( 2, 3));
    }

    @Test
    public void testDoubleComparison() {
        System.out.println("Testing double comparison");
        assertEquals(3.0, comp.getMax(2.0, 3.0), 0.001);
    }

    @Test
    public void testStringComparison() {
        System.out.println("Testing string comparison");
        assertEquals(3.0 , comp.getMax("2", "3") , 0.001);
    }

}

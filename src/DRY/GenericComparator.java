package DRY;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 13:29
 *
 * Demonstrates using generics to reduce the LOC compared to
 * the 'InefficientComparator' class.  Note that this can't
 * implement 'MyComparitor' since it would need non-generic
 * methods for 'double getMax(double n, double m)' etc.. .
 *
 * I could move the ternary operator (ie. the real code) to
 * a private generic method (eg. 'private <T> T privateGetMax(T n, T m)')
 * then have a public generic method which delegates to it, and
 * then make non-generic methods to implement the interface which
 * also delegate to it.
 *
 * The reason for moving the actual code to a private method with a
 * different name is that, from within the non-specific method, you
 * can't call the generic method since the non-specific method
 * always wins.  Eg,
 *
 * int getMax(int n, int m)
 * // is called preferably to:
 * <T> getMax(T n, T m)
 */
public class GenericComparator {
    public <T extends Comparable<T>> T getMax(T n, T m) {
        return n.compareTo(m) > 0 ? n : m;
    }

    public double getMax(String n, String m) {
        double n1 = Double.parseDouble(n);
        double m1 = Double.parseDouble(m);

        return Math.max(n1, m1);
    }
}

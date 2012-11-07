package DRY;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 13:29
 */
public class EfficientComparator {
    public <T extends Comparable<T>> T getMax(T n, T m) {
        return n.compareTo(m) > 0 ? n : m;
    }

    public double getMax(String n, String m) {
        double n1 = Double.parseDouble(n);
        double m1 = Double.parseDouble(m);

        return Math.max(n1, m1);
    }
}

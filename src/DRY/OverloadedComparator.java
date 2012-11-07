package DRY;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 14:09
 */
public class OverloadedComparator implements MyComparator {

    @Override
    public double getMax(double n, double m) {
        return n > m ? n : m;
    }

    @Override
    public int getMax(int n, int m) {
        return (int) getMax((double) n, (double) m);
    }

    @Override
    public double getMax(String n, String m) {
        return getMax(Double.valueOf(n), Double.valueOf(m));
    }
}

package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:05
 */
public interface GenericList<T> extends Iterable<T> {
    void addEnd(T value);
    void addStart(T value);

    T popEnd();
    T popStart();
}

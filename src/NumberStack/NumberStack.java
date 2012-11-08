package NumberStack;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 21:41
 */
public interface NumberStack<T extends Number> {
    void push(T value);
    T pop();
    boolean isEmpty();
}

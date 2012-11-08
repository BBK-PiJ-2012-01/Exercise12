package NumberStack;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 21:43
 */
public interface StackElement <T extends Number> {
    void setNext(StackElement<T> next);
    StackElement<T> getNext();
    T getValue();
}

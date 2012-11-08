package NumberStack;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 21:45
 */
public class StackElementImpl<T extends Number> implements StackElement<T> {
    T value;
    StackElement<T> next;

    StackElementImpl(T value) {
        this.value = value;
    }

    @Override
    public void setNext(StackElement<T> next) {
        this.next = next;
    }

    @Override
    public StackElement<T> getNext() {
        return next;
    }

    @Override
    public T getValue() {
        return value;
    }
}

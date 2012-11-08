package NumberStack;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 21:50
 */
public class NumberStackImpl<T extends Number> implements NumberStack<T> {
    StackElement<T> next;

    @Override
    public void push(T value) {
        StackElement<T> new_next = new StackElementImpl<T>(value);
        new_next.setNext(next);
        next = new_next;
    }

    @Override
    public T pop() {
        if (next == null)
            return null;

        T value_to_return = next.getValue();
        next = next.getNext();
        return value_to_return;
    }

    @Override
    public boolean isEmpty() {
        return next == null;
    }
}

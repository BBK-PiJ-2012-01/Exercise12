package GenericList;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:11
 */
public class GenericListImpl<T> implements GenericList<T> {
    protected Element<T> first, last;

    @Override
    public void add(T value) {
        Element<T> new_element = new ElementImpl<T>(value);

        if (last == null) {
            first = new_element;
            last = new_element;
        } else {
            last.setNext(new_element);
            last = new_element;
        }
    }


    @Override
    public T popEnd() {
        if (last == null)
            return null;

        T to_return = last.getValue();
        last = last.getPrev();
        if (last == null)
            first = null;
        else
            last.setNext(null);
        return to_return;
    }

    @Override
    public T popStart() {
        if (first == null)
            return null;

        T to_return = first.getValue();
        first = first.getNext();
        if (first == null)
            last = null;
        else
            first.setPrev(null);
        return to_return;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericIterator<T>(first);
    }
}

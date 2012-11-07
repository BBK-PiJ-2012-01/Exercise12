package GenericList;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:54
 */
public class GenericIterator <T> implements Iterator<T> {
    Element<T> next_element, this_element;

    GenericIterator(Element<T> first) {
        next_element = first;
    }

    @Override
    public boolean hasNext() {
        return next_element != null;
    }

    @Override
    public T next() {
        this_element = next_element;
        next_element = next_element.getNext();
        return this_element.getValue();
    }

    @Override
    public void remove() {
        if (this_element.getPrev() != null)
            this_element.getPrev().setNext(next_element);
        else if (this_element.getNext() != null)
            this_element.getNext().setPrev(this_element.getPrev());
    }
}

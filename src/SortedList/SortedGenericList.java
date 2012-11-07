package SortedList;


import GenericList.Element;
import GenericList.ElementImpl;
import GenericList.GenericListImpl;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 16:50
 */
public class SortedGenericList<T extends Comparable<T>> extends GenericListImpl<T> {
    @Override
    public void add(T value) {
        Element<T> lower = null, higher = first, new_element = new ElementImpl<T>(value);

        while(higher != null) {
            if (higher.getValue().compareTo(value) > 0) {
                higher.setPrev(new_element);
                new_element.setPrev(lower);
                if (lower == null)
                    first = new_element;
                return;
            }
            lower = higher;
            higher = higher.getNext();
        }

        if (last != null)  {
            last.setNext(new_element);
            last = new_element;
        } else {
            first = new_element;
            last = new_element;
        }

    }
}

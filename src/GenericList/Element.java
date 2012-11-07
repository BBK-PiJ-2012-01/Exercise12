package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:06
 */
public interface Element<T> {
    T getValue();
    void setNext(Element<T> next);
    void setPrev(Element<T> prev);

    Element<T> getNext();
    Element<T> getPrev();
}

package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 15:27
 */
public class ElementImpl<T> implements Element<T> {
    private T value;
    protected Element<T> next, prev;

    public ElementImpl(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setNext(Element<T> next) {
        if (this.next != null && this.next.getPrev() != null) {
            Element<T> old_next = this.next;
            this.next = null;
            old_next.setPrev(null);
        }

        this.next = next;

        if (this.next != null && this.next.getPrev() != this)
            this.next.setPrev(this);
    }

    @Override
    public void setPrev(Element<T> prev) {
        if (this.prev != null && this.prev.getNext() != null) {
            Element<T> old_prev = this.prev;
            this.prev = null;
            old_prev.setNext(null);
        }

        this.prev = prev;

        if (this.prev != null && this.prev.getNext() != this)
            this.prev.setNext(this);
    }

    @Override
    public Element<T> getNext() {
        return next;
    }

    @Override
    public Element<T> getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

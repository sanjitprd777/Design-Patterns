package LLD.CacheLRU.algorithms.doublylinkedlist;

public class DLLNode<E> {

    E element;

    DLLNode<E> next;
    DLLNode<E> prev;

    public DLLNode(E element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }

    public E getElement() {
        return element;
    }
}

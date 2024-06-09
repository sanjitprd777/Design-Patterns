package LLD.CacheLRU.algorithms.doublylinkedlist;

import LLD.CacheLRU.algorithms.doublylinkedlist.exception.DLLNodeNotExistException;
import LLD.CacheLRU.algorithms.doublylinkedlist.exception.InvalidElementException;

public class DoublyLinkedList<E> {

    DLLNode<E> head;
    DLLNode<E> tail;

    public DoublyLinkedList() {
        head = new DLLNode<>(null);
        tail = new DLLNode<>(null);

        head.next = tail;
        tail.prev = head;
    }

    public void detachNode(DLLNode<E> node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void addNodeToLast(DLLNode<E> node) {
        DLLNode<E> tailPrev = tail.prev;
        tailPrev.next = node;
        node.prev = tailPrev;
        node.next = tail;
        tail.prev = node;
    }

    public DLLNode<E> addElementToLast(E element) throws InvalidElementException {
        if (element==null) {
            throw new InvalidElementException("Element is null", "BE0012");
        }
        DLLNode<E> newNode = new DLLNode<>(element);
        addNodeToLast(newNode);
        return newNode;
    }

    public DLLNode<E> getNodeAtFirst() throws DLLNodeNotExistException {
        if (head.next == tail)
            throw new DLLNodeNotExistException("Node does not exist", "BE0010");
        return head.next;
    }

    public DLLNode<E> getNodeAtLast() throws DLLNodeNotExistException {
        if (tail.prev == head)
            throw new DLLNodeNotExistException("Node does not exist", "BE0011");
        return tail.prev;
    }
}

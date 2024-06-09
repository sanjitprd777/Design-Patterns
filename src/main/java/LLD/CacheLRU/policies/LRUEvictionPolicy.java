package LLD.CacheLRU.policies;

import LLD.CacheLRU.algorithms.doublylinkedlist.DLLNode;
import LLD.CacheLRU.algorithms.doublylinkedlist.DoublyLinkedList;

import java.util.HashMap;

public class LRUEvictionPolicy<K> implements EvictionPolicies<K> {

    private final DoublyLinkedList<K> dll;
    private final HashMap<K, DLLNode<K>> dllMapper;

    public LRUEvictionPolicy() {
        dll = new DoublyLinkedList<K>();
        dllMapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(K key) {
        if (dllMapper.containsKey(key)) {
            dll.detachNode(dllMapper.get(key));
            dll.addNodeToLast(dllMapper.get(key));
        } else {
            DLLNode<K> dllNode = dll.addElementToLast(key);
            dllMapper.put(key, dllNode);
        }
    }

    @Override
    public K evictKey() {
        DLLNode<K> dllNode = dll.getNodeAtFirst();
        if (dllNode == null) {
            return null;
        }
        dll.detachNode(dllNode);
        return dllNode.getElement();
    }
}

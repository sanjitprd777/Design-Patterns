package LLD.CacheLRU.storage;

import LLD.CacheLRU.exceptions.StorageFullException;
import LLD.CacheLRU.exceptions.StorageKeyNotFoundException;

import java.util.HashMap;

public class HashMapStorage<K, V> implements Storage<K, V> {

    private final int capacity;
    private final HashMap<K, V> storage;

    public HashMapStorage(int capacity) {
        this.capacity = capacity;
        this.storage = new HashMap<>();
    }

    @Override
    public void add(K key, V value) throws StorageFullException {
        if (isStorageFull()) {
            throw new StorageFullException("Storage full", "BE0001");
        }
        storage.put(key, value);
    }

    @Override
    public void remove(K key) throws StorageKeyNotFoundException {
        if (!storage.containsKey(key)) {
            throw new StorageKeyNotFoundException("Key not found", "BE0002");
        }
        storage.remove(key);
    }

    @Override
    public V get(K key) throws StorageKeyNotFoundException {
        if (!storage.containsKey(key)) {
            throw new StorageKeyNotFoundException("Key not found", "BE0002");
        }
        return storage.get(key);
    }

    private boolean isStorageFull() {
        return (storage.size()==capacity);
    }
}

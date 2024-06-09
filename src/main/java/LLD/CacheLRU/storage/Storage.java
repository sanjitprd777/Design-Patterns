package LLD.CacheLRU.storage;

import LLD.CacheLRU.exceptions.StorageFullException;
import LLD.CacheLRU.exceptions.StorageKeyNotFoundException;

public interface Storage <K, V> {

    void add(K key, V value) throws StorageFullException;

    void remove(K key) throws StorageKeyNotFoundException;

    V get(K key) throws StorageKeyNotFoundException;
}

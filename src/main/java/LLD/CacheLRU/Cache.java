package LLD.CacheLRU;

import LLD.CacheLRU.exceptions.StorageFullException;
import LLD.CacheLRU.exceptions.StorageKeyNotFoundException;
import LLD.CacheLRU.policies.EvictionPolicies;
import LLD.CacheLRU.storage.Storage;

public class Cache<K, V> {

    private final EvictionPolicies<K> evictionPolicies;
    private final Storage<K, V> storage;

    public Cache(EvictionPolicies<K> evictionPolicies, Storage<K, V> storage) {
        this.evictionPolicies = evictionPolicies;
        this.storage = storage;
    }

    public void put(K key, V value) {
        try {
            storage.add(key, value);
            evictionPolicies.keyAccessed(key);
        } catch (StorageFullException sfex) {
            sfex.printExceptionMessage();
            K keyToRemove = evictionPolicies.evictKey();
            storage.remove(keyToRemove);
            put(key, value);
        }
    }

    public V get(K key) {
        V value = null;
        try {
            value = storage.get(key);
            evictionPolicies.keyAccessed(key);
        } catch (StorageKeyNotFoundException skex) {
            skex.printExceptionMessage();
            return null;
        }
        return value;
    }
}

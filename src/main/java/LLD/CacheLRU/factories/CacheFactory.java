package LLD.CacheLRU.factories;

import LLD.CacheLRU.Cache;
import LLD.CacheLRU.policies.LRUEvictionPolicy;
import LLD.CacheLRU.storage.HashMapStorage;

public class CacheFactory<K, V> {

    public Cache<K, V> getDefaultCache() {
        return new Cache<K, V>(new LRUEvictionPolicy<K>(), new HashMapStorage<K, V>(3));
    }
}

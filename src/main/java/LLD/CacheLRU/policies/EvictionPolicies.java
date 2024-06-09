package LLD.CacheLRU.policies;

public interface EvictionPolicies<K> {

    void keyAccessed(K key);

    K evictKey();
}

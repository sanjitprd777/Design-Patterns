package LLD.KeyValueStoreCache.kvstore;

public class Value<T> {

    String key;
    T value;

    public Value(String key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }
}

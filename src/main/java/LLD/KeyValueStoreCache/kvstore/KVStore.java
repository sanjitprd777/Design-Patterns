package LLD.KeyValueStoreCache.kvstore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class KVStore {

    HashMap<String, List<Value<?>>> kvStore;
    HashMap<String, HashSet<String>> vkStore;
    HashMap<String, Class<?>> attrClass;

    public KVStore() {
        this.kvStore = new HashMap<>();
        this.vkStore = new HashMap<>();
        this.attrClass = new HashMap<>();
    }

    public List<Value<?>> get(String key) {
        return kvStore.getOrDefault(key, null);
    }

    public void put(String key, List<Value<?>> values) throws Exception {
        values.forEach(value -> {
            if (attrClass.containsKey(value.key) && value.value.getClass() != attrClass.get(value.key)) {
                throw new RuntimeException("Data Type Error");
            } else {
                attrClass.put(value.key, value.value.getClass());
            }
        });

        kvStore.put(key, values);

        values.stream().map(Value::toString).forEach(value -> vkStore.computeIfAbsent(value, v -> new HashSet<>()).add(key));
    }

    public List<String> getKeys() {
        return kvStore.keySet().stream().toList();
    }

    public List<String> search(Value<?> value) {
        return vkStore.getOrDefault(value.toString(), new HashSet<>()).stream().toList();
    }

    public void delete(String key) {
        List<Value<?>> values = kvStore.get(key);
        kvStore.remove(key);

        values.stream().map(Value::toString).forEach(v -> {
            vkStore.get(v).remove(key);
        });
    }
}

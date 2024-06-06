package LLD.KeyValueStoreCache;

import LLD.KeyValueStoreCache.kvstore.KVStore;
import LLD.KeyValueStoreCache.kvstore.Value;

import java.util.Arrays;
import java.util.List;

public class Main {

    // Problem Statement: https://workat.tech/machine-coding/practice/design-key-value-store-6gz6cq124k65

    public static void main(String[] args) {
        KVStore kvStore = new KVStore();

        List<Value<?>> values;
        List<String> keys, valueKeyList;

        try {
            values = Arrays.asList(new Value<>("title", "SDE-Bootcamp"), new Value<>("price", 30000.00),
                    new Value<>("enrolled", false), new Value<>("estimated_time", 30));
            kvStore.put("sde_bootcamp", values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            values = kvStore.get("sde_bootcamp");
            System.out.println(values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            keys = kvStore.getKeys();
            System.out.println(keys);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            values = Arrays.asList(new Value<>("title", "SDE-Kickstart"), new Value<>("price", 4000),
                    new Value<>("enrolled", true), new Value<>("estimated_time", 0));
            kvStore.put("sde_kickstart", values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            values = kvStore.get("sde_kickstart");
            if (values==null)
                System.out.println("No entry found for sde_kickstart");
            else
                System.out.println(values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            keys = kvStore.getKeys();
            System.out.println(keys);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            values = Arrays.asList(new Value<>("title", "SDE-Kickstart"), new Value<>("price", 4000.00),
                    new Value<>("enrolled", true), new Value<>("estimated_time", 0));
            kvStore.put("sde_kickstart", values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            values = kvStore.get("sde_kickstart");
            if (values==null)
                System.out.println("No entry found for sde_kickstart");
            else
                System.out.println(values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            keys = kvStore.getKeys();
            System.out.println(keys);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            kvStore.delete("sde_bootcamp");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            values = kvStore.get("sde_bootcamp");
            if (values==null)
                System.out.println("No entry found for sde_bootcamp");
            else
                System.out.println(values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            keys = kvStore.getKeys();
            System.out.println(keys);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            values = Arrays.asList(new Value<>("title", "SDE-Bootcamp"), new Value<>("price", 30000.00),
                    new Value<>("enrolled", true), new Value<>("estimated_time", 30));
            kvStore.put("sde_bootcamp", values);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            valueKeyList = kvStore.search(new Value<>("price", 30000.00));
            System.out.println(valueKeyList);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            valueKeyList = kvStore.search(new Value<>("enrolled", true));
            System.out.println(valueKeyList);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

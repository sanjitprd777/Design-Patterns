package LLD.CacheLRU;

import LLD.CacheLRU.factories.CacheFactory;

public class Main {

    public static void main(String[] args) {
        Cache<Object, Object> defaultCache = new CacheFactory<>().getDefaultCache();

        defaultCache.put(1, 1);
        defaultCache.put(2, 2);
        defaultCache.put(3, 3);

        System.out.println(defaultCache.get(2));

        defaultCache.put(4, 1);

        System.out.println(defaultCache.get(2));

        defaultCache.put(5, 1);

        System.out.println(defaultCache.get(2));

        defaultCache.put(6, 1);

        System.out.println(defaultCache.get(6));

        defaultCache.put(1, 1);

        System.out.println(defaultCache.get(8));
    }
}

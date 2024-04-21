package CreationalDesignPatterns.Singleton.ExampleUsingEnums;

public class Demo {

    // ENUM is a guaranteed Singleton.
    public enum Singleton {
        UNIQUE_INSTANCE;
        // This is the same as -> public static final Singleton UNIQUE_INSTANCE = new Singleton();
        // Who is initializing it -> The JVM. Using an inbuilt -> private Singleton() {} constructor here.
        // Below code is implicit. No need to write it.
        private Singleton() {
            System.out.println("Hi");
        }
    }

    public static void main(String... args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        // Note: Enum fields are compile time constants. But they are constructed when referenced for the first time.
        System.out.println(singleton);
        // use singleton here...
    }
}


/*
An enum type is a special type of class.
Your enum will actually be compiled to something like

public final class Singleton {
    public final static Singleton INSTANCE = new Singleton();
    private Singleton(){}
}

When your code first accesses INSTANCE, the class Singleton will be loaded and initialized by the JVM.
This process initializes the static field above once (lazily).

More details -> https://dzone.com/articles/java-singletons-using-enum

 */
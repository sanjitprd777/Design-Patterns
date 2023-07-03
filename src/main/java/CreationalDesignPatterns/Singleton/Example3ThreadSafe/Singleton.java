package CreationalDesignPatterns.Singleton.Example3ThreadSafe;

public class Singleton {
    public String value;

    // The field must be declared volatile so that double check lock would work correctly. It ensures
    // that multiple threads handle the instance variable correctly when it is being initialized to Singleton instance.
    private volatile static Singleton instance;
    // Note: We can also use eager instantiation of instance variable, but it is useful only when we are always going
    // to use this object otherwise it just hops up the resource. Also, it makes sure that class instantiates the object
    // before any thread access it. Code -> private static Singleton instance = new Singleton();

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    // One solution is to synchronize this method, but it makes code 100 times slower hence it's not done.
    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.

        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        // The reason why we are using a separate local variable is because we want to use
        // volatile variable less possible to increase performance by 40%.


        // Understanding why we need double-check locking?
        // Say 10 threads come at this method at once. 4 threads pass the if condition and are waiting for its
        // turn to get the lock. When the first thread completes and creates, the remaining 3 threads don't
        // create a new instance after going inside synchronized block. Hence, inner check is required.
        // For other 6 threads, we have one more outer check so that they won't wait to get lock when an instance
        // is already initialized and can skip waiting time lock for the synchronized code as it is expensive.
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(value);
                }
            }
        }
        return result;
    }
}

/*
Ques: What about class loaders? I heard there’s a chance that two class loaders could each end up with their
own instance of Singleton.
Ans: Yes, that is true as each class loader defines a namespace. If you have two or more class loaders, you can load the
same class multiple times (once in each class loader). Now, if that class happens to be a Singleton, then, since we have
more than one version of the class, we also have more than one instance of Singleton. So, if you are using multiple
class loaders and Singletons, be careful. One way around this problem is to specify the class loader yourself.
 */

/*
Reflection and serialization/deserialization can also present problems with Singletons.
 */
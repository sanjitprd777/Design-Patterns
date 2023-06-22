package CreationalDesignPatterns.Singleton.Example3ThreadSafe;

public class Demo {

    public static void main(String[] args) {
        System.out.println("If output are same, meaning Singleton gives same objects.");
        System.out.println("If output are different, meaning Singleton gives different objects.");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        }
    }

}

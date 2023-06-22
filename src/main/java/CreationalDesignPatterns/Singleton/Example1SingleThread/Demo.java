package CreationalDesignPatterns.Singleton.Example1SingleThread;

public class Demo {

    public static void main(String[] args) {
        System.out.println("If output are same, meaning Singleton gives same objects.");
        System.out.println("If output are different, meaning Singleton gives different objects.");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton singleton2 = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }
}

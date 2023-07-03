package CreationalDesignPatterns.Singleton.Example1SingleThread;

public class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            System.out.println("Creating Singleton instance variable.");
            instance = new Singleton(value);
        }
        else {
            System.out.println("Returning old instance variable on subsequent calls.");
        }
        return instance;
    }
}

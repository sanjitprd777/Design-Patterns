package CreationalDesignPatterns.Singleton.Example2MultipleThread;

public class Singleton {
    public String value;
    private static Singleton instance;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
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

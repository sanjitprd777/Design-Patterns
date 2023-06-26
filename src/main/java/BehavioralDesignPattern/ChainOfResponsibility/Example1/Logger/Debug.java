package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

public class Debug extends LogProcessor {

    public Debug(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String logLevel, String message) {
        if (DEBUG.equals(logLevel)) {
            System.out.println("DEBUG log: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}

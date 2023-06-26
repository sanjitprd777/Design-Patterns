package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

public abstract class LogProcessor {

    private final LogProcessor logProcessor;

    public static final String INFO = "INFO";
    public static final String DEBUG = "DEBUG";
    public static final String ERROR = "ERROR";

    public LogProcessor(LogProcessor logProcessor) {
        this.logProcessor = logProcessor;
    }

    public void log(String logLevel, String message) {
        if (logProcessor != null) {
            logProcessor.log(logLevel, message);
        }
        else {
            throw new AssertionError("Invalid log method: " + logLevel + " with message: " + message);
        }
    }
}

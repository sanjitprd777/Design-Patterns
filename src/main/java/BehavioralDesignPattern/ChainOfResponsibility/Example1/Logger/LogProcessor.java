package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

public abstract class LogProcessor {

    private final LogProcessor logProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        this.logProcessor = logProcessor;
    }

    public void log(LogType logLevel, String message) {
        if (logProcessor != null) {
            logProcessor.log(logLevel, message);
        }
        else {
            System.out.println("Invalid log method: " + logLevel + " with message: " + message);
        }
    }
}

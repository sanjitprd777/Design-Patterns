package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

import static BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.LogType.DEBUG;

public class Debug extends LogProcessor {

    public Debug(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(LogType logLevel, String message) {
        if (DEBUG.equals(logLevel)) {
            System.out.println("DEBUG log: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}

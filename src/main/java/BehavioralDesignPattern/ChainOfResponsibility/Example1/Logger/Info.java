package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

import static BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.LogType.INFO;

public class Info extends LogProcessor {

    public Info(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(LogType logLevel, String message) {
        if (INFO.equals(logLevel)) {
            System.out.println("INFO log: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}

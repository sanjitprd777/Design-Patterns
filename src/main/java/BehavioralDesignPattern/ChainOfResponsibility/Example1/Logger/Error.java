package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

import static BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.LogType.ERROR;

public class Error extends LogProcessor {

    public Error(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(LogType logLevel, String message) {
        if (ERROR.equals(logLevel)) {
            System.out.println("ERROR log: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}

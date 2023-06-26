package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

public class Info extends LogProcessor {

    public Info(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String logLevel, String message) {
        if (INFO.equals(logLevel)) {
            System.out.println("INFO log: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}

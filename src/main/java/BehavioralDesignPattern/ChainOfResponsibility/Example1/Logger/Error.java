package BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger;

public class Error extends LogProcessor {

    public Error(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String logLevel, String message) {
        if (ERROR.equals(logLevel)) {
            System.out.println("ERROR log: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}

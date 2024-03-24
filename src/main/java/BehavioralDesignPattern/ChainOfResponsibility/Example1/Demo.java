package BehavioralDesignPattern.ChainOfResponsibility.Example1;

import BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.*;
import BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.Error;

public class Demo {

    public static void main(String[] args) {
        LogProcessor logProcessor = new Info(new Debug(new Error(null)));

        logProcessor.log(LogType.INFO, "This is info message");
        logProcessor.log(LogType.DEBUG, "This is debug message");
        logProcessor.log(LogType.ERROR, "This is error message");

        logProcessor.log(null, "This log level is not implemented");
    }
}

package BehavioralDesignPattern.ChainOfResponsibility.Example1;

import BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.Debug;
import BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.Error;
import BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.Info;
import BehavioralDesignPattern.ChainOfResponsibility.Example1.Logger.LogProcessor;

public class Demo {

    public static void main(String[] args) {
        LogProcessor logProcessor = new Info(new Debug(new Error(null)));

        logProcessor.log("INFO", "This is info message");
        logProcessor.log("DEBUG", "This is debug message");
        logProcessor.log("ERROR", "This is error message");

        logProcessor.log("XYZ", "This log level is not implemented");
    }
}

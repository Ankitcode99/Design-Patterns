package org.ankitcode99.chainOfResponsibilityPattern;

/**
 * @author : AnkitCode99
 * This is a child class extending Log Processor abstract class
 */
public class InfoLogger extends LogProcessor{

    InfoLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.INFO){
            System.out.println("INFO: "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}

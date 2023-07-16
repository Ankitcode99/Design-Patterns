package org.ankitcode99.chainOfResponsibilityPattern;

public class ErrorLogger extends LogProcessor{
    ErrorLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.ERROR){
            System.out.println("ERROR: "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}

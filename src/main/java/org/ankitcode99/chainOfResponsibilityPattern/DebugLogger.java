package org.ankitcode99.chainOfResponsibilityPattern;

public class DebugLogger extends LogProcessor{
    DebugLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.DEBUG){
            System.out.println("DEBUG: "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}

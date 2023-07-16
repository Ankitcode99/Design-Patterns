package org.ankitcode99.chainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logProcessor.log(LogProcessor.INFO,"Step is executing correctly");
        logProcessor.log(LogProcessor.DEBUG,"Breakpoint hit found");
        logProcessor.log(LogProcessor.ERROR, "An unexpected error occurred");
    }
}

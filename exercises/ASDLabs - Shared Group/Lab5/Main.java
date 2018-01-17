package com.asd.lab5.prob1;

/**
 * Created by Sandip on 4/28/16.
 */
public class Main {


    public static void main(String[] args) {
        IDebuggerCreator debuggerCreator = new SimpleDebuggerCreator();
        Trace fileDebugger = debuggerCreator.create("trace.log");
        Trace consoleDebugger = debuggerCreator.create("console");
        consoleDebugger.setDebug(true);
        consoleDebugger.debug("debug message");
        consoleDebugger.error("error message");

        fileDebugger.setDebug(true);
        fileDebugger.debug("debug message");
        fileDebugger.error("error message");
    }
}

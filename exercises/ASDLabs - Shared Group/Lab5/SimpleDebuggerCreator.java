package com.asd.lab5.prob1;

/**
 * Created by Sandip on 4/28/16.
 */
public class SimpleDebuggerCreator implements IDebuggerCreator {

    public final static String FILE_TRACE_DEBUGGER = "trace.log";
    public final static String CONSOLE_TRACE_DEBUGGER = "console";

    @Override
    public Trace create(String debuggerType) {
        Trace trace = null;
        switch (debuggerType) {
            case FILE_TRACE_DEBUGGER:
                trace = new FileTrace();
                break;
            case CONSOLE_TRACE_DEBUGGER:
                trace = new ConsoleTrace();
                break;
        }
        return trace;
    }
}

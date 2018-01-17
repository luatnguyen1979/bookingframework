package com.asd.lab5.prob1;

/**
 * Created by Sandip on 4/28/16.
 */
public interface Trace {
    // turn on and off debugging
    public void setDebug( boolean debug );
    // write out a debug message
    public void debug( String message );
    // write out an error message
    public void error( String message );
}
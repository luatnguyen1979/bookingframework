package com.asd.lab5.prob1;

import java.time.LocalTime;

/**
 * Created by Sandip on 4/28/16.
 */
public class ConsoleTrace implements  Trace {
    private boolean isActive =false;
    @Override
    public void setDebug(boolean debug) {
        isActive =debug;
    }

    @Override
    public void debug(String message) {
        if (isActive)System.out.println("*****************Message:"+ LocalTime.now()+" "+message+" *******************");

    }

    @Override
    public void error(String message) {

        if (isActive)System.out.println("*****************Error:"+ LocalTime.now()+" "+message+" *******************");

    }
}

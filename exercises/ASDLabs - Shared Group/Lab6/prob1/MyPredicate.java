package com.asd.lab6.prob1;

/**
 * Created by Sandip on 4/29/16.
 */
public class MyPredicate implements Predicate<String> {

    @Override
    public boolean check(String s) {
        if (s.equalsIgnoreCase("-"))return false;
        return true;
    }
}

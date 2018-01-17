package com.asd.lab6.prob1;

/**
 * Created by Sandip on 4/29/16.
 */
public interface Aggregate {
    public Iterator getIterator(Predicate<String> functor);
}

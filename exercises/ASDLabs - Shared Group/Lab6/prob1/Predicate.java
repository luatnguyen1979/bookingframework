package com.asd.lab6.prob1;

/**
 * Created by Sandip on 4/29/16.
 */
@FunctionalInterface
public interface Predicate<T> {
    public boolean check(T t);
}

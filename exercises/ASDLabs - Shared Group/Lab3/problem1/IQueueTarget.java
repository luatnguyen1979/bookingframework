package com.asd.lab2.problem1;

public interface IQueueTarget    {

    /**
     * Adds the given item to the rear of the queue.
     */
    void enqueue(String item);

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    String dequeue();


    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty();
}

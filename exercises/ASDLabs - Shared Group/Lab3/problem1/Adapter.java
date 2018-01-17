package com.asd.lab2.problem1;

public class Adapter  implements  IQueueTarget,IStackTarget{
   private Adaptee adaptee;

   public Adapter(){
       adaptee = new Adaptee();
   }
    @Override
    public void enqueue(String item) {
        adaptee.add(item);
    }

    @Override
    public String dequeue() {
        int start = adaptee.getStart();
        String str = adaptee.get(start);
        adaptee.remove(start);
        return str;
    }

    @Override
    public void push(String str) {
        adaptee.add(str);
    }
    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }
    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }
}

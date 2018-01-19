package usa.edu.mum.asd.labs.lab2.adapter;

public class Adapter implements Target1, Target2 {

    private Adaptee adaptee = new Adaptee();

    public void push(String str) {
        adaptee.add(str);
    }


    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }


    public boolean isEmpty() {
        return adaptee.empty();
    }


    public int size() {
        return adaptee.getEnd() < 0 ? 0 : adaptee.getEnd() + 1;
    }

    public void enqueue(String str) {
        adaptee.add(str);
    }

    public String dequeue() {
        int start = adaptee.getStart();
        String str = adaptee.get(start);
        adaptee.remove(start);
        return str;
    }
}
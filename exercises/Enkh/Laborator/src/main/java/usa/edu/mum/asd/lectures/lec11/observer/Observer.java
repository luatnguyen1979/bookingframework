package usa.edu.mum.asd.lectures.lec11.observer;

public interface Observer {

    public void update(String symbol, float close, float high, float low, long volume);
}
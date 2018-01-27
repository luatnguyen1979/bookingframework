package usa.edu.mum.asd.lectures.lec11.observer;

public interface Subject {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObservers();
}

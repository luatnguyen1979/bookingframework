package usa.edu.mum.asd.labs.lab11.observer;

import java.util.LinkedList;
import java.util.List;

public class Names implements Subject {

    private List<Observer> observerList = new LinkedList<>();
    private List<String> nameList = new LinkedList<>();
    private final Object LOCK = new Object();

    public boolean addName(String name) {
        nameList.add(name);
        notifyObservers();
        return true;
    }

    public boolean removeName(String name) {
        nameList.remove(name);
        notifyObservers();
        return true;
    }

    public List<String> getNameList() {
        return nameList;
    }

    private String getNames() {
        StringBuilder ret = new StringBuilder();
        for (String s : nameList) {
            if (ret.length() == 0) {
                ret.append(s);
            } else {
                ret.append(", ");
                ret.append(s);
            }
        }
        return ret.toString();
    }


    @Override
    public void attach(Observer observer) {
        synchronized (LOCK) {
            if (!observerList.contains(observer))
                observerList.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        synchronized (LOCK) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        synchronized (LOCK) {
            for (Observer observer : observerList) {
                observer.setNames(getNames());
            }
        }
    }

    public int size() {
        return nameList.size();
    }
}

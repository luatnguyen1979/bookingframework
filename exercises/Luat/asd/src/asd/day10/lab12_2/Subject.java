package asd.day10.lab12_2;

/**
 * 
 * @author luatnguyen
 *
 */
public interface Subject {
	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}

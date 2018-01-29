package asd.day10.lab12_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author luatnguyen
 *
 */
public class PersonData implements Subject{
	private List<Person> persons;
	private List<Observer> observers;
	private final Object MUTEX = new Object();
	
	public PersonData() {
		persons = new ArrayList<>();
		observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		synchronized (MUTEX) {
			if (!observers.contains(observer))
				observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		synchronized (MUTEX) {
			int index = observers.indexOf(observer);
			if (index != -1)
				observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		synchronized (MUTEX) {
			for (Observer observer : observers) {
				observer.reflex(persons);
			}
		}
	}
	
	public void addPerson(Person person){
		persons.add(person);
		notifyObservers();
	}
	
	public void removePerson(Person person){
		int index = persons.indexOf(person);
		if (index != -1){
			persons.remove(person);
			notifyObservers();
		}
	}
	
	public List<Person> getPersonData() {
		return persons;
	}

}

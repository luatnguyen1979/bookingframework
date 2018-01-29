package asd.day10.lab12_2;

import java.util.List;

/**
 * 
 * @author luatnguyen
 *
 */
public class PersonObserver implements Observer {

	public PersonObserver(PersonData personData) {
		personData.addObserver(this);
	}

	@Override
	public void reflex(List<Person> persons) {
		System.out.println("All persons in from list:");
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}

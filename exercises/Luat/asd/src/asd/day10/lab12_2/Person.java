package asd.day10.lab12_2;

/**
 * 
 * @author luatnguyen
 *
 */
public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}

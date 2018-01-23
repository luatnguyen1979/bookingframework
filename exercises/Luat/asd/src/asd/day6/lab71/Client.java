package asd.day6.lab71;

import asd.day6.lab71.NameIterator;

/**
 * @author luatnguyen
 *
 */
public class Client {

	public static void main(String[] args) {

		final String names[][] = { { "Kiet", "Nguyen" }, { "Luat", "Nguyen" }, { "-" }, { "Duong", "Nguyen" },
				{ "-" } };

		final NameIterator nameIterator = new NameIterator(names);

		while (nameIterator.hasNext()) {
			String fullName = (String) nameIterator.next();
			if (!fullName.equals(""))
				System.out.println("Name" + fullName);
		}
	}

}

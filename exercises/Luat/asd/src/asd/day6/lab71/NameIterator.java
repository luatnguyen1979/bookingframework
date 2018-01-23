package asd.day6.lab71;

import asd.day6.lab71.Iterator;

/**
 * @author luatnguyen
 *
 */

public class NameIterator implements Iterator {
	private String names[][];

	public NameIterator(String names[][]) {
		this.names = names;
	}

	int index1;
	int index2;

	@Override
	public boolean hasNext() {
		if (index1 < names.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			String fullName = "";
			for (index2 = 0; index2 < names[index1].length; index2++) {
				if (!names[index1][index2].equals("-"))
					fullName += names[index1][index2] + " ";
			}
			index1++;
			return fullName;
		}
		return null;
	}

}

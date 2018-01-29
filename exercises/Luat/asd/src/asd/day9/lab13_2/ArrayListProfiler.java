/**
 * 
 */
package asd.day9.lab13_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author luatnguyen
 *
 */
public class ArrayListProfiler extends DecoratorListProfile {

	/**
	 * @param list
	 */
	public ArrayListProfiler(List list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.DecoratorListProfile#add(java.lang.Object)
	 */
	@Override
	public boolean add(Object e) {
		long startTime = System.currentTimeMillis();
		boolean value = this.list.add(e);
		System.out.print("ArrayList.add() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.DecoratorListProfile#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(Object obj) {
		long startTime = System.currentTimeMillis();
		boolean value = this.list.remove(obj);
		System.out.print("ArrayList.remove() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.DecoratorListProfile#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(Object obj) {
		long startTime = System.currentTimeMillis();
		boolean value = this.list.contains(obj);
		System.out.print("ArrayList.contains() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.DecoratorListProfile#size()
	 */
	@Override
	public int size() {
		long startTime = System.currentTimeMillis();
		int value = this.list.size();
		System.out.print("ArrayList.size() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}

	

	

	

	

	
}

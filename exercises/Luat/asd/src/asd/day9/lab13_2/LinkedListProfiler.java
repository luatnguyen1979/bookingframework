/**
 * 
 */
package asd.day9.lab13_2;

import java.util.List;

/**
 * @author luatnguyen
 *
 */
public class LinkedListProfiler extends DecoratorListProfile {

	public LinkedListProfiler(List list) {
		super(list);
		
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.ListProfile#add(java.lang.Object)
	 */
	@Override
	public boolean add(Object e) {
		long startTime = System.currentTimeMillis();
		boolean value = this.list.add(e);
		System.out.print("LinkedList.add() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.ListProfile#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(Object obj) {
		long startTime = System.currentTimeMillis();
		boolean value = this.list.remove(obj);
		System.out.print("LinkedList.remove() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.ListProfile#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(Object obj) {
		long startTime = System.currentTimeMillis();
		boolean value = this.list.contains(obj);
		System.out.print("LinkedList.contains() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}

	/* (non-Javadoc)
	 * @see asd.day9.lab13_2.ListProfile#size()
	 */
	@Override
	public int size() {
		long startTime = System.currentTimeMillis();
		int value = this.list.size();
		System.out.print("LinkedList.size() takes " + (System.currentTimeMillis() - startTime) + " ms.");
		return value;
	}
	
}

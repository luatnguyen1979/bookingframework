/**
 * 
 */
package asd.day2.lab31;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luatnguyen
 *
 */
public class AdapterCollection implements IQueue<Object>, IStack<Object> {
	// Adaptee
	List items = new ArrayList();
	int size = 0;

	// Stack implementation
	/**
	 * 
	 */
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (size > 0) {
			items.remove(size - 1);
			size--;
		}
		return null;
	}

	@Override
	public void push(Object obj) {
		items.add(obj);
		size++;
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	@Override
	public Object peek() {
		if (size > 0) {
			items.get(size - 1);
		}
		return null;
	}

	// Queue implementation
	@Override
	public Object enqueue(Object obj) {
		items.add(obj);
		size++;
		return obj;
	}

	@Override
	public Object dequeue() {
		if (items.size() > 0) {
			size--;
			return items.remove(0);
		}
		return null;
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		if (items.size() > 0) {
			items.get(0);
		}
		return null;
	}

}

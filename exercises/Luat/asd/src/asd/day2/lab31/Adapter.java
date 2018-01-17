/**
 * 
 */
package asd.day2.lab31;

/**
 * @author luatnguyen
 *
 */
public class Adapter implements IQueue<String>, IStack<String> {
	private Adaptee adaptee;
	
	public Adapter() {
		adaptee = new Adaptee();
	}
	
	@Override
	public String pop() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public void push(String obj) {
		adaptee.add(obj);	
	}

	@Override
	public void enqueue(String obj) {
		adaptee.add(obj);
	}

	@Override
	public String dequeue() {
		int start = adaptee.getStart();
		String str = adaptee.startString();
		adaptee.remove(start);
		return str;
	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

}

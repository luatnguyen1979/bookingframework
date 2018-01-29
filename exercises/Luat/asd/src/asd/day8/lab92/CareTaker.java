/**
 * 
 */
package asd.day8.lab92;

import java.util.Stack;

/**
 * @author luatnguyen
 *
 */
public class CareTaker {
	private Stack<Memento> stack = new Stack<>();

	public void add(Memento state) {
		stack.add(state);
	}

	public Memento undo() {
		if (stack.isEmpty()) {
			System.out.println("Do nothing.");
			return new Memento("");
		} else {
			return stack.pop();
		}
	}
}

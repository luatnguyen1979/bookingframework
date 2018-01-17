/**
 * 
 */
package asd.day2;

/**
 * @author luatnguyen
 *
 */
public interface IStack <T> {
	/**
	 * Returns the object at the top of the Stack without removing it.
	 * 
	 */
	public T peek();
	
	/**
	 * 
	 * Removes and returns the object at the top of the Stack.
	 */
	public T pop();
	
	/**
	 * 	Inserts an object at the top of the Stack.
	 */
	public void push(T obj);
	
}

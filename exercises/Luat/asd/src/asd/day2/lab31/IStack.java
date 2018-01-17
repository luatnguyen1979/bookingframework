/**
 * 
 */
package asd.day2.lab31;

/**
 * @author luatnguyen
 *
 */
public interface IStack <T> {

	public boolean isEmpty();
	
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

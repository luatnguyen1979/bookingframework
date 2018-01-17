/**
 * 
 */
package asd.day2.lab31;

/**
 * @author luatnguyen
 *
 */
public interface IQueue <T> {
	
	/**
	 * add the object and return the object
	 * @param obj
	 * @return
	 */
	public void enqueue(T obj);
	
	/**
	 * Remove the first object and return the object
	 * @return
	 */
	
	public T dequeue();
	
	/** return the object and 
	 * 
	 * @return
	 */
	public boolean isEmpty();

}

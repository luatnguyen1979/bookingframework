/**
 * 
 */
package asd.day2;

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
	public T enqueue(T obj);
	
	/**
	 * Remove the first object and return the object
	 * @return
	 */
	
	public T dequeue();
	
	/** return the object and 
	 * 
	 * @return
	 */
	public T get();

}

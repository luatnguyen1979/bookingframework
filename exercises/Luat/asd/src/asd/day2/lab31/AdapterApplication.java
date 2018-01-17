/**
 * 
 */
package asd.day2.lab31;

import java.util.Queue;

/**
 * @author luatnguyen
 *
 */
public class AdapterApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Adapter ada = new Adapter();
		ada.push("test");
		ada.enqueue("obj");
		ada.push("test1");
		ada.enqueue("obj1");
		
		while (!ada.isEmpty()) {
			System.out.println(ada.dequeue());
		}

	}

}

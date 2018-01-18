
/**
 * @author luatnguyen
 *
 */
package asd.day1;

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i ++)
		MySingleton.INSTANCE.getString();
	}

}

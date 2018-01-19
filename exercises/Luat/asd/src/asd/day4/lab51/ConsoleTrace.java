/**
 * 
 */
package asd.day4.lab51;

/**
 * @author luatnguyen
 *
 */
public class ConsoleTrace extends Trace {

	/* (non-Javadoc)
	 * @see asd.day4.lab51.Trace#debug(java.lang.String)
	 */
	@Override
	public void debug(String message) {
		if (super.isDebug()) {
			System.out.println("Debugging From Console: " + message);
		}
		
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab51.Trace#error(java.lang.String)
	 */
	@Override
	public void error(String message) {
		System.out.println("Error From File Console: " + message);
		
	}

}

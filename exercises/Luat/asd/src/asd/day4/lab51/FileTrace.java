/**
 * 
 */
package asd.day4.lab51;

/**
 * @author luatnguyen
 *
 */
public class FileTrace implements ITrace {
	private boolean isDebug = false;
	/* (non-Javadoc)
	 * @see asd.day4.lab51.Trace#setDebug(boolean)
	 */
	@Override
	public void setDebug(boolean isDebug) {
		this.isDebug = isDebug;
		
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab51.Trace#debug(java.lang.String)
	 */
	@Override
	public void debug(String message) {
		if (this.isDebug) {
			System.out.println("Debugging From File Trace: " + message);
		}
		
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab51.Trace#error(java.lang.String)
	 */
	@Override
	public void error(String message) {
		System.out.println("Error From File Trace: " + message);
		
	}

}

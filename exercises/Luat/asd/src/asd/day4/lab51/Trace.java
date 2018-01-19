/**
 * 
 */
package asd.day4.lab51;

/**
 * @author luatnguyen
 *
 */
public abstract class Trace implements ITrace{
	private boolean isDebug = false;
	
	/* (non-Javadoc)
	 * @see asd.day4.lab51.Trace#setDebug(boolean)
	 */
	@Override
	public void setDebug(boolean isDebug) {
		this.isDebug = isDebug;
		
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab51.ITrace#debug(java.lang.String)
	 */
	@Override
	public abstract void debug(String message);

	/* (non-Javadoc)
	 * @see asd.day4.lab51.ITrace#error(java.lang.String)
	 */
	@Override
	public abstract void error(String message);

	/**
	 * @return the isDebug
	 */
	public boolean isDebug() {
		return isDebug;
	}
	
	
}

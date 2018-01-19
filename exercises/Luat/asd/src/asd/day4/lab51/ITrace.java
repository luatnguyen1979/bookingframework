/**
 * 
 */
package asd.day4.lab51;

/**
 * @author luatnguyen
 *
 */
public interface ITrace {
	 // turn on and off debugging
	 public void setDebug( boolean debug );
	 
	 // write out a debug message
	 public void debug( String message );
	 
	 // write out an error message
	 public void error( String message );
}

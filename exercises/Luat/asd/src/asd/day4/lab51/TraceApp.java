/**
 * 
 */
package asd.day4.lab51;

/**
 * @author luatnguyen
 *
 */
public class TraceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			IDebug debugFactory = DebugFactory.getDebugFactory();
			ITrace trace = debugFactory.getTrace(args[0]);
			trace.setDebug(true);
			trace.debug("This debug message");
			trace.error("This error message");
		}
	}

}

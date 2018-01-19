/**
 * 
 */
package asd.day4.lab51;

/**
 * @author luatnguyen
 *
 */
public class DebugFactory implements IDebug{
	private static final String TRACE_LOG = "trace.log";
	private static final String CONSOLE_LOG = "console";
	
	private static IDebug factory = new DebugFactory();
	
	private DebugFactory(){}
	
	public static IDebug getDebugFactory(){
	return factory;
	}
	/* (non-Javadoc)
	 * @see asd.day4.lab51.IDebug#getTrace(java.lang.String)
	 */
	@Override
	public ITrace getTrace(String logType) {
		if (TRACE_LOG.equals(logType)) {
			System.out.println("Initiate FileTrace object.");
			return new FileTrace();
		} else if (CONSOLE_LOG.equals(logType)) {
			System.out.println("Initiate ConsoleTrace object.");
			return new ConsoleTrace();
		}
		return null;
	}
}

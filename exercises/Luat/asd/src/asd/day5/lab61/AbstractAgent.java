/**
 * 
 */
package asd.day5.lab61;

import org.omg.CORBA.Request;

/**
 * @author luatnguyen
 *
 */
public abstract class AbstractAgent {
	protected AbstractAgent nextAgent;
	public abstract void handleRequest(Request req);
	public boolean canHandleRequest(Request req) {
		return false;
	}

}

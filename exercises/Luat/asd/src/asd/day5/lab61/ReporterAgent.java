/**
 * 
 */
package asd.day5.lab61;

import org.omg.CORBA.Request;

/**
 * @author luatnguyen
 *
 */
public class ReporterAgent extends AbstractAgent {

	/* (non-Javadoc)
	 * @see asd.day5.lab61.AbstractAgent#handleRequest(org.omg.CORBA.Request)
	 */
	@Override
	public void handleRequest(Request req) {
		if (canHandleRequest(req)) {
			return;
		} else {
			if (this.nextAgent != null) {
				this.nextAgent.handleRequest(req);
			}
		}
		
	}

}

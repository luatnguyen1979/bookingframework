/**
 * 
 */
package asd.day7.lab81;

import java.util.Date;

/**
 * @author luatnguyen
 *
 */
public class Call {
	private String requestId;
	private Agent agent;

	public void callPop(Agent agent) {
		this.agent = agent;
		this.requestId = "" + (new Date()).getTime();
	}

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}

	/**
	 * @param agent the agent to set
	 */
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	
	
}

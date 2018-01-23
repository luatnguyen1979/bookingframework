/**
 * 
 */
package asd.day7.lab81;

/**
 * @author luatnguyen
 *
 */
public class Agent {
	private String agentId;
	private String agentName;
	
	
	/**
	 * @param agentId
	 * @param agentName
	 */
	public Agent(String agentId, String agentName) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
	}
	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}
	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}
	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	
}

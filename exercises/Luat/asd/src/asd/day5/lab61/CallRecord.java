/**
 * 
 */
package asd.day5.lab61;

/**
 * @author luatnguyen
 *
 */
public class CallRecord {
	private Customer customer;
	private Agent agent;
	private String reqestInformation;
	private boolean isValid;
	private boolean isASaleLead;
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	/**
	 * @return the reqestInformation
	 */
	public String getReqestInformation() {
		return reqestInformation;
	}
	/**
	 * @param reqestInformation the reqestInformation to set
	 */
	public void setReqestInformation(String reqestInformation) {
		this.reqestInformation = reqestInformation;
	}
	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}
	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	/**
	 * @return the isASaleLead
	 */
	public boolean isASaleLead() {
		return isASaleLead;
	}
	/**
	 * @param isASaleLead the isASaleLead to set
	 */
	public void setASaleLead(boolean isASaleLead) {
		this.isASaleLead = isASaleLead;
	}

}

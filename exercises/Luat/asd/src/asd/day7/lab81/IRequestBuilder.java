/**
 * 
 */
package asd.day7.lab81;

/**
 * @author luatnguyen
 *
 */
public interface IRequestBuilder {
	public void initRequest(Agent agent);
	public boolean loadCustomer(String telephoneNumber);
	public void createCustomer(String firstName, String lastName, String telephoneNumber);
	public void setRequestContent(String reqContent);
	public void setResponseContent(String respContent);
	public void setSaleLead(boolean isSaleLead);
	public void saveRequest(boolean isAnswered, boolean needCallBack);
	public Request getRequest();
}

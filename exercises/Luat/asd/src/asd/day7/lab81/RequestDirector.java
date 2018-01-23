/**
 * 
 */
package asd.day7.lab81;

/**
 * @author luatnguyen
 *
 */
public class RequestDirector {
	private IRequestBuilder requestBuilder = null;

	/**
	 * @param requestBuilder
	 */
	public RequestDirector(IRequestBuilder requestBuilder) {
		this.requestBuilder = requestBuilder;
	}
	
	public void initRequest(Agent agent) {
		requestBuilder.initRequest(agent);
	}
	
	public void saveRequest(String firstName, String lastName, String telephoneNumber, String requestContent, String responseContent) {
		if (!requestBuilder.loadCustomer(telephoneNumber)) {
			requestBuilder.createCustomer(firstName, lastName, telephoneNumber);
		}
		requestBuilder.setRequestContent(requestContent);
		requestBuilder.setResponseContent(responseContent);
		
	}
	
	public void closeRequest(boolean isAnswered, boolean needCallBack, boolean isSaleLead) {
		requestBuilder.setSaleLead(isSaleLead);
		requestBuilder.saveRequest(isAnswered, needCallBack);
	}
	
	public Request getRequest() {
		return requestBuilder.getRequest();
	}
}

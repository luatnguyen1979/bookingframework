/**
 * 
 */
package asd.day7.lab81;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luatnguyen
 *
 */
public class RequestBuilder implements IRequestBuilder {
	private Request request;
	private List<Customer> customers = new ArrayList<Customer>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab81.IRequestBuilder#initRequest(asd.day7.lab81.Agent)
	 */
	@Override
	public void initRequest(Agent agent) {
		Call call = new Call();
		call.callPop(agent);
		request = new Request(call.getRequestId(), call.getAgent());
		System.out.println("Initiatoing the request: " + request.getReqId());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab81.IRequestBuilder#loadCustomer(java.lang.String)
	 */
	@Override
	public boolean loadCustomer(String telephoneNumber) {

		for (Customer customer : customers) {
			if (customer.getTelephoneNumber().equals(telephoneNumber)) {
				request.setRequester(customer);
				System.out.println("Loading existing Customer: " + customer);
				return true;
			}
		}
		return false;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab81.IRequestBuilder#createCustomer(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void createCustomer(String firstName, String lastName, String telephoneNumber) {
		Customer cust = new Customer(firstName, lastName, telephoneNumber);
		System.out.println("Creating new Customer " + cust);
		customers.add(cust);
		request.setRequester(cust);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab81.IRequestBuilder#setRequestContent(java.lang.String)
	 */
	@Override
	public void setRequestContent(String reqContent) {
		request.setReqContent(reqContent);
		System.out.println("Request content: " + reqContent);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab81.IRequestBuilder#setResponseContent(java.lang.String)
	 */
	@Override
	public void setResponseContent(String respContent) {
		request.setRespContent(respContent);
		System.out.println("Response content: " + respContent);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab81.IRequestBuilder#saveRequest(boolean, boolean)
	 */
	@Override
	public void saveRequest(boolean isAnswered, boolean needCallBack) {
		request.setAnswered(isAnswered);
		request.setNeedCallBack(needCallBack);
		System.out.println("Saving request successful: " + request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab81.IRequestBuilder#getRequest()
	 */
	@Override
	public Request getRequest() {
		return request;
	}

	/* (non-Javadoc)
	 * @see asd.day7.lab81.IRequestBuilder#setSaleLead(boolean)
	 */
	@Override
	public void setSaleLead(boolean isSaleLead) {
		request.setSaleLead(isSaleLead);
		
	}

	
}

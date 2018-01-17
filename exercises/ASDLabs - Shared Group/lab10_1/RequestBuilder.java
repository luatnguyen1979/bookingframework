package lab10_1;

import java.util.List;

public class RequestBuilder implements IRequestBuilder {
	private Request request;

	public void initRequest(Agent agent) {
		Call call = new Call();
		call.callPop(agent);
		request = new Request(call.getRequestId(), agent);
		System.out.println("Init Request (request id, agent id): " + call.getRequestId() + ", " + agent.getId());
	}

	@Override
	public boolean loadUserProfile(String phone, List<Customer> customers) {
		for (Customer customer : customers) {
			if (customer.getPhone() == phone) {
				request.setRequester(customer);
				System.out.println("Load Customer: " + customer.getName() + ", " + customer.getPhone());
				return true;
			}
		}
		return false;
	}

	@Override
	public void createCustomer(String name, String phone) {
		Customer customer = new Customer(name, phone);
		request.setRequester(customer);
		System.out.println("Create Customer: " + customer.getName() + ", " + customer.getPhone());
	}

	@Override
	public void createRequestContent(String requestContent) {
		request.setReqContent(requestContent);
		System.out.println("create request content: " + requestContent);
	}

	@Override
	public void createReponseContent(String responseContent) {
		request.setRespContent(responseContent);
		System.out.println("create response content: " + responseContent);
	}

	@Override
	public void saveRequest(boolean isAnswered, boolean needCallBack) {
		request.setAnswered(isAnswered);
		request.setNeedCallBack(needCallBack);
		request.save();
		System.out.println("Save Request successful!");
	}

}

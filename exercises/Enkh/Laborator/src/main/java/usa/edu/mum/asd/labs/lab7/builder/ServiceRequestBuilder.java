package usa.edu.mum.asd.labs.lab7.builder;

public class ServiceRequestBuilder implements RequestBuilder {

    private Request request;

    public ServiceRequestBuilder() {
        this.request = new Request("" + System.currentTimeMillis());
    }

    @Override
    public void buildAgent() {
        Address address = new Address("2000 North Court Street, 16C", "Fairfield", "Iowa",
                "52556");
        Agent agent = new Agent("1", address);
        request.setAgent(agent);
    }

    @Override
    public void buildCustomer(String phone) {
        Database db = new Database();
        request.setRequester(db.getCustomer(phone));
        request.setSaleLead(db.isSaleLead(phone));
    }

    @Override
    public void buildRequestContent(String content) {
        request.setReqContent(content);
    }

    @Override
    public void buildResponseContent(String content) {
        request.setRespContent(content);
    }

    @Override
    public void buildFinal(boolean isAnswered, boolean needCallBack) {
        request.setNeedCallBack(needCallBack);
        request.setAnswered(isAnswered);
    }

    @Override
    public Request getRequest() {
        return request;
    }
}

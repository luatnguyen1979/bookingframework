package usa.edu.mum.asd.labs.lab7.builder;

public interface RequestBuilder {

    public void buildAgent();

    public void buildCustomer(String phone);

    public void buildRequestContent(String content);

    public void buildResponseContent(String content);

    public void buildFinal(boolean isAnswered, boolean needCallBack);

    public Request getRequest();
}

package usa.edu.mum.asd.labs.lab7.builder;

public class RequestDirector {

    private RequestBuilder requestBuilder; //or multiple meal builders

    public RequestDirector(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    public void constructRequest(String phone, String content, String response, boolean isAnswered, boolean needCallBack) {
        requestBuilder.buildAgent();
        requestBuilder.buildCustomer(phone);
        requestBuilder.buildRequestContent(content);
        requestBuilder.buildResponseContent(response);
        requestBuilder.buildFinal(isAnswered, needCallBack);


    }

    public Request getRequest() {
        return requestBuilder.getRequest();
    }
}

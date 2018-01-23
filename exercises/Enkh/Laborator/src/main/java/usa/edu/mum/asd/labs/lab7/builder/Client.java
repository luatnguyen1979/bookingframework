package usa.edu.mum.asd.labs.lab7.builder;

public class Client {

    public static void main(String[] args) {
        ReferRequestBuilder referRequestBuilder = new ReferRequestBuilder();
        RequestDirector requestDirector = new RequestDirector(referRequestBuilder);
        requestDirector.constructRequest("6414513571", "How can I get this promotion?",
                "I dont know", false, false);
        System.out.println(requestDirector.getRequest());
    }
}

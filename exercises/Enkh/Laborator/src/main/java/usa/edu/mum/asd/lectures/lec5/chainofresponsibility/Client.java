package usa.edu.mum.asd.lectures.lec5.chainofresponsibility;

public class Client {

    private ChainBuilder chain; //can be injected or received from a constructor

    public Client() {
        this.chain = new ChainBuilder();
    }

    public void sendRequest(Request request) {
        chain.getHandler().handleRequest(request);
    }

    public static void main(String[] args) {
        Request request = new Request("Do something", Level.EASY);
        Client client = new Client();
        client.sendRequest(request);
    }
}
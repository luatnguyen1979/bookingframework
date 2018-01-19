package usa.edu.mum.asd.lectures.lec5.chainofresponsibility;

public abstract class AbstractAgent {

    protected AbstractAgent nextAgent;

    abstract public void handleRequest(Request req);

    boolean canHandleRequest(Request req) {
    }
}
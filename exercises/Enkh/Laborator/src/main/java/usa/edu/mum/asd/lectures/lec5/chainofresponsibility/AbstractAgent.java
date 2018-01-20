package usa.edu.mum.asd.lectures.lec5.chainofresponsibility;

public abstract class AbstractAgent {

    protected AbstractAgent nextAgent;
    //added by Eegii
    protected Level level;

    public abstract void handleRequest(Request req);

    /**
     * Implemented by Eegii
     *
     * @param req
     * @return
     */
    public boolean canHandleRequest(Request req) {
        return req.getLevel() == level;
    }
}
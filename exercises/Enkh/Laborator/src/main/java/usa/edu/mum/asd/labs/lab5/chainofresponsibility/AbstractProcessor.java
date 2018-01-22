package usa.edu.mum.asd.labs.lab5.chainofresponsibility;

public abstract class AbstractProcessor {

    protected AbstractProcessor nextProcessor;

    public abstract void handleRequest(CallRecord callRecord);

    abstract boolean canHandleRequest(CallRecord callRecord);
}

package usa.edu.mum.asd.lectures.lec5.chainofresponsibility;

public class ChainBuilder {

    private AbstractAgent handler;

    //other necessary code here
    public ChainBuilder() {
        AbstractAgent junior = new JuniorAgent();
        AbstractAgent senior = new SeniorAgent();
        AbstractAgent supervisor = new SupervisorAgent();
        junior.nextAgent = senior;
        senior.nextAgent = supervisor;
        handler = junior;
    }

    public AbstractAgent getHandler() {
        return handler;
    }
}
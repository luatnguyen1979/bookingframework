package usa.edu.mum.asd.labs.lab4.factorymethod;

public class Client {

    public static void main(String[] args) {
        ITrace trace = FactoryImpl.getInstance().createTrace("trace.log");
        trace.setDebug(true);
        trace.debug("GO!");
        trace.error("Found a problem!");
        ITrace trace1 = FactoryImpl.getInstance().createTrace("console");
        trace1.setDebug(true);
        trace1.debug("GO!");
        trace1.error("Found a problem!");
    }
}

package usa.edu.mum.asd.labs.lab4.factorymethod;

public class ConsoleTrace implements ITrace {

    private boolean debug = false;

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) {
            System.out.println("DEBUG: " + message);
        }
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}

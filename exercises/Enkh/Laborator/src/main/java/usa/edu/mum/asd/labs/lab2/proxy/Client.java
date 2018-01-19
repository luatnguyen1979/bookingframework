package usa.edu.mum.asd.labs.lab2.proxy;

public class Client implements Runnable {

    private ITable iTable = new Proxy();
    private Thread t;
    private String threadName;

    Client(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Running " + threadName);
        iTable.modifyRow(3, new RowImpl(threadName));
        System.out.println("Thread " + threadName + " exiting. Result=" + iTable.getRow(3).getElement());
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Client client = new Client("" + i);
            client.start();
        }
    }
}

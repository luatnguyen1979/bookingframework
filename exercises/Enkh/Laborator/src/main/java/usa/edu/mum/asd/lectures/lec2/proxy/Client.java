package usa.edu.mum.asd.lectures.lec2.proxy;

public class Client {
    private static ISubject iSubject = new Proxy("eegii", "pwd");

    public static void main(String[] args) {
        try {
            iSubject.runCommand("del");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

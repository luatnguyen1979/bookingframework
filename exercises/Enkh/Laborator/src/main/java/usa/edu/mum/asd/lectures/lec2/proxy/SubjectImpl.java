package usa.edu.mum.asd.lectures.lec2.proxy;

public class SubjectImpl implements ISubject {

    public void runCommand(String cmd) throws Exception {
        if (cmd.toLowerCase().equals("hello")) {
            System.out.println("Hello World");
        } else if (cmd.toLowerCase().startsWith("del")) {
            System.out.println("Delete World");
        } else {
            System.out.println("GoodBye!");
        }
    }
}

package usa.edu.mum.asd.lectures.lec2.proxy;

public class Proxy implements ISubject {

    private boolean isAdmin;
    private ISubject iSubject;

    public Proxy(String user, String password) {
        if ("eegii".equals(user) && "pwd".equals(password))
            isAdmin = true;
        this.iSubject = new SubjectImpl();
    }

    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            iSubject.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("del")) {
                throw new Exception("'delete' command is not allowed for non-admin users.");
            } else {
                iSubject.runCommand(cmd);
            }
        }
    }
}

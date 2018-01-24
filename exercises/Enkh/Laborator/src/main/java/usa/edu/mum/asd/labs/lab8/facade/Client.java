package usa.edu.mum.asd.labs.lab8.facade;

public class Client {

    public static void main(String[] args) {
        DBFacade dbFacade = new DBFacade();
        dbFacade.callProcedure("procedure1", args);
        dbFacade.callProcedure("select username from user;", args);
    }
}

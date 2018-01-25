package usa.edu.mum.asd.labs.lab8.facade;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        DBFacade dbFacade = new DBFacade();
        //dbFacade.callProcedure("procedure1", args);
        List<String> result = dbFacade.getColumnData("select FIRSTNAME from USERPROFILE", args);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

package usa.edu.mum.asd.labs.lab8.facade;

import java.util.LinkedList;
import java.util.List;

public class DBFacade implements DBInterface {

    @Override
    public boolean callProcedure(String procedureName, String[] args) {
        boolean ret = false;
        try {
            Database database = new Database("");
            database.checkConnection();
            ret = database.callStatement(procedureName, args);
            database.closeResource();
            database.closeConnection();
        } catch (Exception e) {
        }
        return ret;
    }

    @Override
    public List<String> getColumnData(String query, String[] args) {
        List<String> ret = new LinkedList<>();
        try {
            Database database = new Database("");
            database.checkConnection();
            ret = database.preperadStatement(query, args);
            database.closeResource();
            database.closeConnection();
        } catch (Exception e) {
        }
        return ret;
    }
}

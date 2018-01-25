package usa.edu.mum.asd.labs.lab8.facade;

import usa.edu.mum.asd.labs.lab8.memento.UserProfile;

import java.util.LinkedList;
import java.util.List;

public class DBFacade implements DBInterface {

    @Override
    public boolean callProcedure(String procedureName, String[] args) {
        boolean ret = false;
        try {
            Database database = new Database("jdbc:mysql://localhost:3306/asd");
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
            Database database = new Database("jdbc:mysql://localhost:3306/asd");
            database.checkConnection();
            ret = database.preperadStatement(query, args);
            database.closeResource();
            database.closeConnection();
        } catch (Exception e) {
        }
        return ret;
    }

    @Override
    public UserProfile getUserProfile(String id) {
        UserProfile ret = null;
        try {
            Database database = new Database("jdbc:mysql://localhost:3306/asd");
            database.checkConnection();
            ret = database.getUserProfile("SELECT * FROM USERPROFILE WHERE ID = ?", id);
            database.closeResource();
            database.closeConnection();
        } catch (Exception e) {
        }
        return ret;
    }

    @Override
    public boolean saveUserProfile(UserProfile userProfile) {
        boolean ret = false;
        try {
            Database database = new Database("jdbc:mysql://localhost:3306/asd");
            database.checkConnection();
            ret = database.saveUserProfile("INSERT INTO USERPROFILE VALUES (?,?,?)", userProfile);
            database.closeResource();
            database.closeConnection();
        } catch (Exception e) {
        }
        return ret;
    }
}

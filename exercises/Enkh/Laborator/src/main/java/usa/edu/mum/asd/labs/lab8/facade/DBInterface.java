package usa.edu.mum.asd.labs.lab8.facade;

import usa.edu.mum.asd.labs.lab8.memento.UserProfile;

import java.util.List;

public interface DBInterface {

    public boolean callProcedure(String procedureName, String[] args);

    public List<String> getColumnData(String query, String[] args);

    public UserProfile getUserProfile(String id);

    public boolean saveUserProfile(UserProfile userProfile);
}

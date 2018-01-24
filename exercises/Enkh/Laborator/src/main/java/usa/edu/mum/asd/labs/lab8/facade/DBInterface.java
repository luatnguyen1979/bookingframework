package usa.edu.mum.asd.labs.lab8.facade;

import java.util.List;

public interface DBInterface {

    public boolean callProcedure(String procedureName, String[] args);

    public List<String> getColumnData(String query, String[] args);
}

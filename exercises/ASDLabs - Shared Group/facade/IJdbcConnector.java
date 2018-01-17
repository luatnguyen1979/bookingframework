package facade;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IJdbcConnector {

	PreparedStatement prepareStatement(String sql) throws SQLException;
	CallableStatement prepareCall(String sql) throws SQLException;
	ResultSet executeQuery(PreparedStatement prep) throws SQLException;
	void closeConnection();
}

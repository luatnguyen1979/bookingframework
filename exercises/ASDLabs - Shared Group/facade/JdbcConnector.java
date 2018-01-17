package facade;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnector implements IJdbcConnector{

	private static JdbcConnector instance= null;
	private Connection connection=null;
	private CallableStatement call;
	private PreparedStatement prep;
	private ResultSet rset;
	
	public static  JdbcConnector getInstace(String database) {
		if(instance==null) instance = new JdbcConnector(database);
		return instance;
	} 
	
	 public JdbcConnector(String database) {
		 try {
				Class.forName("<driver>").newInstance();
				connection = DriverManager.getConnection(database);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		if(connection!=null){
				return connection.prepareStatement(sql);
		}else{
			return null;
		}
	}

	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		call = connection.prepareCall(sql);
		return call;
	}

	@Override
	public void closeConnection() {
		
		if (rset != null) {
			try {
				rset.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		
		if(prep!=null){
			try {
				prep.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(call!=null){
			try {
				call.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ResultSet executeQuery(PreparedStatement prep) throws SQLException {
		rset = prep.executeQuery();
		return rset;
	}

}

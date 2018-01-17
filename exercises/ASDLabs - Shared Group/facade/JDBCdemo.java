package facade;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCdemo {

	public static void main(String[] args) {

		PreparedStatement prep = null;
		CallableStatement call = null;
		ResultSet rset = null;
		IJdbcConnector jdbcConnector =  JdbcConnector.getInstace("<database>");
		
		try {
			
			String sql = "SELECT * FROM <table> WHERE <column name> =?";
			
			prep = jdbcConnector.prepareStatement(sql);
			
			prep.setString(1, "<column value>");//parameter index, parameter value
			
			rset = jdbcConnector.executeQuery(prep);
			
			if (rset.next()) {
				System.out.println(rset.getString("<column name"));
			}
			sql = "{call <stored procedure>( ?, ? )}";
			
			call = jdbcConnector.prepareCall(sql);
			
			call.setInt(1, 1972);
			call.registerOutParameter(2, java.sql.Types.INTEGER);
			call.execute();
			System.out.println(call.getInt(2));
			
		}catch(NullPointerException ex){
			ex.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}finally {
									
			if (jdbcConnector != null) {
				jdbcConnector.closeConnection();
			}
		}
	}
}
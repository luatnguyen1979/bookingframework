/**
 * 
 */
package asd.day7.lab91;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author luatnguyen
 *
 */
public class DBConnection {
	/**
	 * Return a DB connection
	 * 
	 * @return
	 */
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("<driver>").newInstance();
			conn = DriverManager.getConnection("<database>");

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}

	public void executeQuery(Connection connection, String sql) {
		PreparedStatement prep = null;
		ResultSet rset = null;
		try {
			prep = connection.prepareStatement(sql);
			prep.setString(1, "<column value>");
			rset = prep.executeQuery();
			if (rset.next()) {
				System.out.println(rset.getString("<column name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (prep != null) {
				try {
					prep.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public void executeProcedure(Connection conn, String sql) {
		CallableStatement call = null;
		try {
			call = conn.prepareCall(sql);
			call.setInt(1, 1972);
			call.registerOutParameter(2, java.sql.Types.INTEGER);
			call.execute();
			System.out.println(call.getInt(2));
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (call != null) {
				try {
					call.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public void closeDBConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}

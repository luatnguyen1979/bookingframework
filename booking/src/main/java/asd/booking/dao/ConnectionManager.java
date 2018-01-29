/**
 * 
 */
package asd.booking.dao;

/**
 * @author luatnguyen
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	static Connection con;
	static String url;

	public static Connection getConnection() {

		try {
			
			String url = "jdbc:mysql://localhost/booking";
//			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
//			Connection conn = DriverManager.getConnection (url, "username", "password");
//			String url = "jdbc:odbc:" + "DataSource";
			// assuming "DataSource" is your DataSource name

			Class.forName("com.mysql.jdbc.Driver").newInstance ();

			try {
				con = DriverManager.getConnection(url, "root", "root");

				// assuming your SQL Server's username is "username"
				// and password is "password"

			}

			catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
}

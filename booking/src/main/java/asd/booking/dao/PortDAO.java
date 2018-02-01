package asd.booking.dao;

import asd.booking.domain.Address;
import asd.booking.domain.trip.Port;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PortDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;

	public static List<Port> getList() {
		List<Port> ret = new LinkedList<>();
		final String sql = "SELECT * FROM port";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = Database.getInstance().preparedStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Address address = AddressDAO.get(rs.getInt("address_id"));
				Port port = new Port(rs.getInt("id"), rs.getString("name"), address);
				ret.add(port);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.getInstance().close(ps);
			Database.getInstance().close(rs);
		}
		return ret;
	}

	public static List<Port> getPortList() {
		List<Port> portList = new ArrayList<Port>();
		Statement stmt = null;

		final String searchQuery = "SELECT * FROM PORT";
		// process

		System.out.println("Query: " + searchQuery);

		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery.toString());
			while (rs.next()) {
				int addressId = rs.getInt("address_id");
				Address address = AddressDAO.get(addressId);
				Port port = new Port(rs.getInt("id"), rs.getString("name"), address);
				portList.add(port);
			}

			System.out.println("Port list size: " + portList.size());

		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		}

		// some exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		return portList;
	}

	public static Port get(int id) {
		Port ret = null;
		final String sql = "SELECT * FROM port WHERE id = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = Database.getInstance().preparedStatement(sql, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				Address address = AddressDAO.get(rs.getInt("address_id"));
				ret = new Port(rs.getInt("id"), rs.getString("name"), address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.getInstance().close(ps);
			Database.getInstance().close(rs);
		}
		return ret;
	}
}

package asd.booking.dao;

import asd.booking.domain.Customer;
import asd.booking.domain.trip.Passenger;
import asd.booking.domain.trip.Route;
import asd.booking.domain.trip.Trip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TripDAO {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement prestmt = null;

	public static void insert(Trip trip) {
		final String sql = "INSERT INTO trip (roundway, bookDate, route_id, customer_id) " + "VALUES (?,now(),?,?)";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			for (Passenger passenger : trip.getPassengerList()) {
				PassengerDAO.insert(passenger);
			}

			ps = Database.getInstance().preparedStatement(sql, trip.getBookedDate(), trip.getRoute().getId(),
					trip.getBooker().getUserId());
			if (ps.executeUpdate() == 0) {
				throw new SQLException("No row is affected.");
			}
			rs = ps.getGeneratedKeys();
			if (rs.next()) {
				trip.setId(rs.getInt("1"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.getInstance().close(ps);
			Database.getInstance().close(rs);
		}
	}

	public static Trip get(int id) {
		Trip ret = null;
		final String sql = "SELECT * FROM trip WHERE id = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = Database.getInstance().preparedStatement(sql, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				Route route = RouteDAO.get(rs.getInt("route_id"));
				Customer customer = CustomerDAO.getCustomer(rs.getInt("customer_id"));
				List<Passenger> passengerList = PassengerDAO.getList(id);
				String bookingDate = rs.getString("bookDate");
				String confirmationNumber = rs.getString("confirmationnumber");
				ret = new Trip(rs.getInt("id"), bookingDate, passengerList, rs.getString("bookdate"), customer, route, confirmationNumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.getInstance().close(ps);
			Database.getInstance().close(rs);
		}
		return ret;
	}

	public static List<Trip> getTripList(int customerId) {

		List<Trip> tripList = new ArrayList<Trip>();
		Statement stmt = null;

		String searchQuery = "SELECT * FROM trip WHERE customer_id = " + customerId;
		// process

		System.out.println("Query: " + searchQuery);

		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery.toString());
			while (rs.next()) {
				int tripId = rs.getInt("id");
				String tripWay = rs.getString("tripway");
				String bookingDate = rs.getString("bookDate");
				int routeId = rs.getInt("route_id");
				String confirmationNumber = rs.getString("confirmationnumber");
				Route route = RouteDAO.get(routeId);
				List<Passenger> passengerList = PassengerDAO.getList(tripId);
				Customer cust = CustomerDAO.getCustomer(customerId);
				Trip trip = new Trip(tripId, tripWay, passengerList, bookingDate, cust, route, confirmationNumber);
				tripList.add(trip);
			}

			System.out.println("Port list size: " + tripList.size());

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

		return tripList;

	}
}

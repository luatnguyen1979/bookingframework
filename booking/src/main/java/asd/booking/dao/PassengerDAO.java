package asd.booking.dao;

import asd.booking.domain.trip.Passenger;
import asd.booking.domain.trip.Trip;
import asd.booking.utils.PassengerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PassengerDAO {

    static Connection currentCon = null;
    static ResultSet rs = null;
    static PreparedStatement ps = null;

    public static int insert(Passenger passenger) {
        final String sql = "INSERT INTO passenger (fullname, type, trip_id) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            currentCon = ConnectionManager.getConnection();
            ps = currentCon.prepareStatement(sql);
            ps.setString(1, passenger.getFullname());
            ps.setString(2, passenger.getPassengerType().toString());
            ps.setInt(3, passenger.getTrip().getId());

            if (ps.executeUpdate() == 0) {
                throw new SQLException("No row is affected.");
            }
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                passenger.setId(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {
                }
                ps = null;
            }
            if (currentCon != null) {
                try {
                    currentCon.close();
                } catch (Exception e) {
                }
                currentCon = null;
            }
        }
        return passenger.getId();
    }

    public static List<Passenger> getList(int tripId) {
        List<Passenger> passengerList = new LinkedList<>();
        final String sql = "SELECT * FROM passengerList WHERE id = ?";
        try {
            currentCon = ConnectionManager.getConnection();
            ps = currentCon.prepareStatement(sql);
            ps.setInt(1, tripId);
            rs = ps.executeQuery();
            while (rs.next()) {
                PassengerType passengerType = PassengerType.valueOf(rs.getString("type"));
                Trip trip = TripDAO.get(rs.getInt("trip_id"));
                Passenger passenger = new Passenger(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        passengerType, trip);
                passengerList.add(passenger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {
                }
                ps = null;
            }
            if (currentCon != null) {
                try {
                    currentCon.close();
                } catch (Exception e) {
                }

                currentCon = null;
            }
        }
        return passengerList;
    }
}

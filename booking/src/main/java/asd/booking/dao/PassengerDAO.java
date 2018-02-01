package asd.booking.dao;

import asd.booking.domain.discount.passenger.Passenger;
import asd.booking.domain.trip.Trip;
import asd.booking.utils.PassengerType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PassengerDAO {

    public static void insert(Passenger passenger) {
        final String sql = "INSERT INTO passenger (fullname, type, trip_id) VALUES (?, ?,?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = Database.getInstance().preparedStatement(sql,
                    passenger.getFullname(),
                    passenger.getPassengerType().toString(),
                    passenger.getTrip().getId());
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
            Database.getInstance().close(rs);
            Database.getInstance().close(ps);
        }
    }

    public static List<Passenger> getList(int id) {
        List<Passenger> passengerList = new LinkedList<>();
        final String sql = "SELECT * FROM passengerList WHERE id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = Database.getInstance().preparedStatement(sql, id);
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
            Database.getInstance().close(rs);
            Database.getInstance().close(ps);
        }
        return passengerList;
    }
}

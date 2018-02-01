package asd.booking.dao;

import asd.booking.domain.Customer;
import asd.booking.domain.discount.passenger.Passenger;
import asd.booking.domain.trip.Route;
import asd.booking.domain.trip.Trip;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TripDAO {

    public void insertTrip(Trip trip) {
        final String sql = "INSERT INTO trip (roundway, bookDate, route_id, customer_id) " +
                "VALUES (?,now(),?,?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            for (Passenger passenger : trip.getPassengerList()) {
                PassengerDAO.insert(passenger);
            }
            int roundway = trip.isRoundWay() ? 1 : 0;
            ps = Database.getInstance().preparedStatement(sql,
                    roundway,
                    trip.getRoute().getId(),
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
                boolean roundway = rs.getInt("roundway") == 1 ? true : false;
                ret = new Trip(rs.getInt("id"),
                        roundway,
                        passengerList,
                        rs.getDate("bookdate").toLocalDate(),
                        customer,
                        route);
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

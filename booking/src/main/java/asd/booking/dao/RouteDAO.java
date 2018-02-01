package asd.booking.dao;

import asd.booking.domain.trip.Port;
import asd.booking.domain.trip.Route;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RouteDAO {

    public static Route get(int sourcePortId, int destinationPortId, LocalDate departureDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        String date = departureDate.format(formatter);
        Route ret = null;
        final String sql = "SELECT * FROM route WHERE sourceport_id = ? " +
                "AND destinationport_id = ?" +
                "AND DATE(departuredate) = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = Database.getInstance().preparedStatement(sql, sourcePortId, destinationPortId, date);
            rs = ps.executeQuery();
            if (rs.next()) {
                Port sourcePort = PortDAO.get(rs.getInt("sourceport_id"));
                Port destinationPort = PortDAO.get(rs.getInt("destinationport_id"));
                ret = new Route(rs.getInt("id"),
                        sourcePort,
                        destinationPort,
                        rs.getDouble("duration"),
                        rs.getDouble("distance"),
                        rs.getDouble("pricesingleway"),
                        rs.getDouble("priceroundway"),
                        TrainDAO.get(rs.getInt("train_id")),
                        rs.getDate("departuredate").toLocalDate(),
                        rs.getDate("arrivaldate").toLocalDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Database.getInstance().close(ps);
            Database.getInstance().close(rs);
        }
        return ret;
    }

    public static Route get(int id) {
        Route ret = null;
        final String sql = "SELECT * FROM route WHERE id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = Database.getInstance().preparedStatement(sql, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Port sourcePort = PortDAO.get(rs.getInt("sourceport_id"));
                Port destinationPort = PortDAO.get(rs.getInt("destinationport_id"));
                ret = new Route(rs.getInt("id"),
                        sourcePort,
                        destinationPort,
                        rs.getDouble("duration"),
                        rs.getDouble("distance"),
                        rs.getDouble("pricesingleway"),
                        rs.getDouble("priceroundway"),
                        TrainDAO.get(rs.getInt("train_id")),
                        rs.getDate("departuredate").toLocalDate(),
                        rs.getDate("arrivaldate").toLocalDate());
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

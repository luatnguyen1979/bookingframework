package asd.booking.dao;

import asd.booking.domain.Address;
import asd.booking.domain.trip.Port;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class PortDAO {

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
                Port port = new Port(
                        rs.getInt("id"),
                        rs.getString("name"),
                        address);
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
                ret = new Port(
                        rs.getInt("id"),
                        rs.getString("name"),
                        address);
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

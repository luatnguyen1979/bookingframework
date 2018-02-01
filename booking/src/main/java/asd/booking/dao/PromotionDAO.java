package asd.booking.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PromotionDAO {

    public static Double getPercent(String code) {
        Double ret = null;
        final String sql = "SELECT percent FROM promotion " +
                "WHERE promotioncode = ? " +
                "AND startdate <= now() " +
                "AND enddate > now()";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = Database.getInstance().preparedStatement(sql, code);
            rs = ps.executeQuery();
            if (rs.next()) {
                ret = rs.getDouble(1);
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

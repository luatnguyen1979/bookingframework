package usa.edu.mum.asd.labs.lab8.facade;

import usa.edu.mum.asd.labs.lab8.memento.UserProfile;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Database {

    private Connection conn;
    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;
    private String databaseUrl;

    public Database(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        this.ps = null;
        this.conn = null;
        this.cs = null;
    }

    public void getConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        //Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection(databaseUrl, "root", "Password1");
    }

    public void checkConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        if (this.conn == null || this.conn.isClosed()) getConnection();
    }

    public void closeConnection() {
        try {
            if (this.conn != null && !this.conn.isClosed()) this.conn.close();
        } catch (SQLException se) {
        }
    }

    public void closeResource() {
        try {
            if (cs != null && !cs.isClosed()) {
                cs.close();
                cs = null;
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
                ps = null;
            }
            if (rs != null && !rs.isClosed()) {
                rs.close();
                rs = null;
            }
        } catch (SQLException se) {
        }
    }

    public boolean callStatement(String procedure, String[] args) {
        boolean ret = false;
        int index = 0;
        try {
            StringBuilder sql = new StringBuilder(100);
            sql.append("{call ");
            sql.append(procedure);
            sql.append("(");
            for (String s : args) {
                if (sql.toString().endsWith("(")) {
                    sql.append("?");
                } else {
                    sql.append(", ?");
                }
            }
            sql.append(")}");
            cs = this.conn.prepareCall(sql.toString());
            for (String s : args) {
                cs.setString(index++, s);
            }
            ret = cs.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public List<String> preperadStatement(String query, String[] args) {
        List<String> ret = new LinkedList<>();
        int index = 0;
        try {
            ps = this.conn.prepareStatement(query);
            for (String s : args) {
                ps.setString(index++, s);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                ret.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public UserProfile getUserProfile(String query, String id) {
        UserProfile ret = null;
        try {
            ps = this.conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                ret = new UserProfile(
                        rs.getString("ID"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public boolean saveUserProfile(String query, UserProfile userProfile) {
        boolean ret = false;
        try {
            ps = this.conn.prepareStatement(query);
            ps.setString(1, userProfile.getId());
            ps.setString(2, userProfile.getFirstname());
            ps.setString(3, userProfile.getLastname());
            ret = ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}

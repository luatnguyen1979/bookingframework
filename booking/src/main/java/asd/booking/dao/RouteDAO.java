package asd.booking.dao;

import asd.booking.domain.Address;
import asd.booking.domain.trip.Port;
import asd.booking.domain.trip.Route;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RouteDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement prestmt = null;
	
    public static Route getRoute(int sourcePortId, int destinationPortId, LocalDate departureDate, int travelerNumber) {
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
    
    public static List<Route> getRoute(int sourcePortId, int destinationPortId, String departureDate, int travelerNumber) {
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
//        String ddate = departureDate.format(formatter);
//        String adate = arrivalDate.format(formatter);
    		List<Route> routeList = new ArrayList<Route>();
    		Statement stmt = null;

    		StringBuffer searchQuery = new StringBuffer();
    		searchQuery.append("select * from route r");
    		searchQuery.append(" left JOIN train t ON r.trainid = t.trainid");
    		searchQuery.append(" where sourceport_id = "+sourcePortId+" AND destinationport_id = " + destinationPortId);
    		searchQuery.append(" AND DATE(departuredate) = '"+ departureDate +"'");
    		// process

    		System.out.println("Query: " + searchQuery);

    		try {
    			// connect to DB
    			currentCon = ConnectionManager.getConnection();
    			stmt = currentCon.createStatement();
    			rs = stmt.executeQuery(searchQuery.toString());
    			while (rs.next()) {

    			}

    			System.out.println("Port list size: " + routeList.size());

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

    		return routeList;
    	
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

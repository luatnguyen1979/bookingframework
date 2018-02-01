package asd.booking.dao;

import asd.booking.domain.trip.Route;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.List;

public class RouteDAOTest extends TestCase {

    public void testGetRoute() {
        List<Route> result = RouteDAO.getRoute(1, 2, "2018-02-03");
        Assert.assertNotNull(result);
    }

    public void testGetRoute1() {
        Route result = RouteDAO.getRoute(1, 2, LocalDate.now());
        Assert.assertNotNull(result);

    }

    public void testGet() {
        Route result = RouteDAO.get(1);
        Assert.assertNotNull(result);
    }
}
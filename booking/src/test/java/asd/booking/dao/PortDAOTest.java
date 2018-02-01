package asd.booking.dao;

import asd.booking.domain.trip.Port;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

public class PortDAOTest extends TestCase {

    public void testGetPortList() {
        List<Port> result = PortDAO.getPortList();
        Assert.assertNotNull(result);
    }

    public void testGet() {
        Port result = PortDAO.get(1);
        Assert.assertNotNull(result);
    }
}
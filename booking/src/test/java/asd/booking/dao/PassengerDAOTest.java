package asd.booking.dao;

import asd.booking.domain.trip.Passenger;
import asd.booking.domain.trip.Trip;
import asd.booking.utils.PassengerType;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

public class PassengerDAOTest extends TestCase {

    public void testInsert() {
        Trip trip = new Trip();
        trip.setId(1);
        Passenger passenger = new Passenger(null,
                "Enkh Amgalan Erdenebat",
                PassengerType.ADULT,
                trip);
        PassengerDAO.insert(passenger);
        Integer expectedValue = 21;
        Assert.assertNotNull(passenger.getId());
    }

    public void testGetList() {
        List<Passenger> result = PassengerDAO.getList(1);
        Assert.assertNotNull(result);
    }

    public void testGetCount() {
        Integer result = PassengerDAO.getCount(1);
        Integer wrongValue = 0;
        Assert.assertNotSame(wrongValue, result);
    }
}
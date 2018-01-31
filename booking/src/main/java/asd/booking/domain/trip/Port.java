package asd.booking.domain.trip;

import asd.booking.domain.Address;

public class Port {

    private final int id;
    private final String name;
    private final Address address;

    public Port(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

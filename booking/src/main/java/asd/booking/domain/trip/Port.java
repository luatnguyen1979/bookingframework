package asd.booking.domain.trip;

import asd.booking.domain.Address;

public class Port {

    private final Integer id;
    private final String name;
    private final Address address;
    private State state;

    public Port(Integer id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }
}

package asd.booking.domain.trip;

import asd.booking.domain.Address;

public class Port {

    private final Integer id;
    private final String name;
    private final Address address;
    private final Integer zipCodeS;
    private final Integer zipCodeE;
    private State state;

    public Port(Integer id, String name, Address address, Integer zipCodeS, Integer zipCodeE, State state) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zipCodeS = zipCodeS;
        this.zipCodeE = zipCodeE;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Integer getZipCodeS() {
        return zipCodeS;
    }

    public Integer getZipCodeE() {
        return zipCodeE;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

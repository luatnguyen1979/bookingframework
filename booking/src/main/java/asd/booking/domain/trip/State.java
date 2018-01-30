package asd.booking.domain.trip;

import java.util.List;

public class State {

    private final String fullName;
    private final String shortName;
    private final String zipcode;
    private final List<Port> portList;

    public State(String fullName, String shortName, String zipcode, List<Port> portList) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.zipcode = zipcode;
        this.portList = portList;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public List<Port> getPortList() {
        return portList;
    }
}

package asd.booking.domain.trip;

import java.util.List;

public class State {

    private final String fullName;
    private final String shortName;
    private final String zipCode;
    private final List<Port> portList;

    public State(String fullName, String shortName, String zipCode, List<Port> portList) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.zipCode = zipCode;
        for (Port port : portList) {
            port.setState(this);
        }
        this.portList = portList;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public List<Port> getPortList() {
        return portList;
    }
}

package asd.booking.domain.trip;

import java.util.List;

public class State {

    private final Integer id;
    private final String fullName;
    private final String shortName;
    private final String zipCodeS;
    private final String zipCodeE;
    private final List<Port> portList;

    public State(Integer id, String fullName, String shortName, String zipCodeS, String zipCodeE, List<Port> portList) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.zipCodeS = zipCodeS;
        this.zipCodeE = zipCodeE;
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

    public String getZipCodeS() {
        return zipCodeS;
    }

    public List<Port> getPortList() {
        return portList;
    }

    public Integer getId() {
        return id;
    }

    public String getZipCodeE() {
        return zipCodeE;
    }
}

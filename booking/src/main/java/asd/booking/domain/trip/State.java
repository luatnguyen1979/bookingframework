package asd.booking.domain.trip;

import java.util.List;

public class State {

    private final Integer id;
    private final String fullName;
    private final String shortName;
    private final List<Port> portList;

    public State(Integer id, String fullName, String shortName, List<Port> portList) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.portList = portList;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public List<Port> getPortList() {
        return portList;
    }
}

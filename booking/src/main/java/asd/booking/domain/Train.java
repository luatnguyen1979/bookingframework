/*
 * Created on Jan 30, 2018
 */
package asd.booking.domain;

import java.util.Date;

public class Train {

    private String name;
    private Date startTime;
    private Date arrivalTime;
    private String fromStation;
    private String toStation;
    
    public Train() {
        
    }
    
    public Train(String name, Date start, Date arrival, String from, String to) {
        super();
        this.name = name;
        this.startTime = start;
        this.arrivalTime = arrival;
        this.fromStation = from;
        this.toStation = to;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Date getStartTime() {
        return startTime;
    }
    
    public void setStartTime(Date start) {
        this.startTime = start;
    }
    
    public Date getArrivalTime() {
        return arrivalTime;
    }
    
    public void setArrivalTime(Date arrival) {
        this.arrivalTime = arrival;
    }
    
    public String getFromStation() {
        return fromStation;
    }
    
    public void setFromStation(String from) {
        this.fromStation = from;
    }
    
    public String getToStation() {
        return toStation;
    }
    
    public void setToStation(String to) {
        this.toStation = to;
    }
}

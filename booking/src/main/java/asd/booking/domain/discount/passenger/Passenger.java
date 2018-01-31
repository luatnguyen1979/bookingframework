package asd.booking.domain.discount.passenger;

import asd.booking.domain.discount.calculation.Calculation;
import asd.booking.utils.PassengerType;

public class Passenger {

    private Integer id;
    private Calculation calculation;
    private String name;
    private String description;
    private PassengerType passengerType;

    public Passenger(Integer id, Calculation calculation, String name, String description, PassengerType passengerType) {
        this.id = id;
        this.calculation = calculation;
        this.name = name;
        this.description = description;
        this.passengerType = passengerType;

    }

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	/**
	 * @return the passengerType
	 */
	public PassengerType getPassengerType() {
		return passengerType;
	}

	/**
	 * @param passengerType the passengerType to set
	 */
	public void setPassengerType(PassengerType passengerType) {
		this.passengerType = passengerType;
	}

    
    
}

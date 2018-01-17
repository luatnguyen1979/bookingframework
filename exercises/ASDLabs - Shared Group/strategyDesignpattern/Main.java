package lesson12.strategyDesignpattern;

import lesson12.strategyDesignpattern.concreteStrategy.MultiClasses;
import lesson12.strategyDesignpattern.concreteStrategy.SinglePrices;
import lesson12.strategyDesignpattern.concreteStrategy.TwoClasses;

public class Main {

	public static void main(String[] args) {
		
		AirLinesCompany airLine = new AirLinesCompany();
		
		Flight NepalAir = new Flight("NE012PAL", "Nepal AirLine", 20);
		Flight BuddhaAir = new Flight("NE210PAL", "Buddha AirLine", 24);
		
		// Add AirLine 
		airLine.addFlight(NepalAir);
		airLine.addFlight(BuddhaAir);
		
		// Get Revenue of AirLine
		float revenue = airLine.getRevenue(new SinglePrices());
		System.out.println("AirLine SinglePrices Revenue : " + revenue);
		
		revenue = airLine.getRevenue(new TwoClasses());
		System.out.println("AirLine TwoClasses Revenue : " + revenue);
		
		revenue = airLine.getRevenue(new MultiClasses());
		System.out.println("AirLine MultiClasses Revenue : " + revenue);
	}

}

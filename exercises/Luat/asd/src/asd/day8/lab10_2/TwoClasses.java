/**
 * 
 */
package asd.day8.lab10_2;

/**
 * @author luatnguyen
 *
 */
public class TwoClasses extends FlightClass {
	
	/**
	 * @param passengerQuantity
	 */
	public TwoClasses(int[] passengerQuantity) {
		super(passengerQuantity);
	}

	/* (non-Javadoc)
	 * @see asd.day8.lab10_2.ClassType#getTotalRevenue()
	 */
	@Override
	public double getTotalRevenue() {
		double totalRevenue = 0;
		for (int number : this.passengerQuantityList) {
			int buninessPassenger = (number / 3);
			double businessRevenue = buninessPassenger * FlightConstants.BASE_PRICE * 1.5;
			double coachRevenue = (number - buninessPassenger) * FlightConstants.BASE_PRICE * 0.75;
			totalRevenue += businessRevenue + coachRevenue - (FlightConstants.FIXED_COST * 1.1);
		}
		return totalRevenue;
	}

}

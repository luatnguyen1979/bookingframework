/**
 * 
 */
package asd.day8.lab10_2;

/**
 * @author luatnguyen
 *
 */
public class MultiClasses extends FlightClass {

	/**
	 * @param passengerQuantity
	 */
	public MultiClasses(int[] passengerQuantity) {
		super(passengerQuantity);
	}

	/* (non-Javadoc)
	 * @see asd.day8.lab10_2.ClassType#getTotalRevenue()
	 */
	@Override
	public double getTotalRevenue() {
		double totalRevenue = 0;
		for (int number : this.passengerQuantityList) {
			int firstPassenger = (number / 10);
			int buninessPassenger = firstPassenger * 2;
			double firstRevenue = firstPassenger * FlightConstants.BASE_PRICE * 4;
			double businessRevenue = buninessPassenger * FlightConstants.BASE_PRICE * 1.5;
			double coachRevenue = (number - firstPassenger - buninessPassenger) * FlightConstants.BASE_PRICE * 0.75;
			totalRevenue += firstRevenue + businessRevenue + coachRevenue - (FlightConstants.FIXED_COST * 1.2);
		}
		return totalRevenue;
	}

}

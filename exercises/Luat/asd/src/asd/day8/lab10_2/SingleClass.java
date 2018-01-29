/**
 * 
 */
package asd.day8.lab10_2;

/**
 * @author luatnguyen
 *
 */
public class SingleClass extends FlightClass {
	
	/**
	 * @param passengerQuantity
	 */
	public SingleClass(int[] passengerQuantity) {
		super(passengerQuantity);
	}


	/* (non-Javadoc)
	 * @see asd.day8.lab10_2.ClassType#getTotalRevenue()
	 */
	@Override
	public double getTotalRevenue() {
		double totalRevenue = 0;
		for (int number : this.passengerQuantityList) {
		totalRevenue += (number * FlightConstants.BASE_PRICE) - FlightConstants.FIXED_COST;
		}
		return totalRevenue;
	}

}

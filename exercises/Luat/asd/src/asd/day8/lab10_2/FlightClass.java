/**
 * 
 */
package asd.day8.lab10_2;

/**
 * @author luatnguyen
 *
 */
public abstract class FlightClass implements ClassType {
	protected int[] passengerQuantityList;

	/**
	 * @param passengerQuantity
	 */
	public FlightClass(int[] passengerQuantity) {
		this.passengerQuantityList = passengerQuantity;
	}

}

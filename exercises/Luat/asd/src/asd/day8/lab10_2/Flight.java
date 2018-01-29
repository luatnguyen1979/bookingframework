/**
 * 
 */
package asd.day8.lab10_2;

/**
 * @author luatnguyen
 *
 */
public class Flight {
	private ClassType classType;

	/**
	 * @param classType
	 */
	public Flight(ClassType classType) {
		this.classType = classType;
	}
	
	public double getTotalRevenue() {
		return classType.getTotalRevenue();
	}

}

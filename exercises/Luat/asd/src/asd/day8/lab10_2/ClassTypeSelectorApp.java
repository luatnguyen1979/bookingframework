/**
 * 
 */
package asd.day8.lab10_2;

/**
 * @author luatnguyen
 *
 */
public class ClassTypeSelectorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] passengerQuantityList = {180, 200, 250, 300};

		Flight singleClass = new Flight(new SingleClass(passengerQuantityList));
		Flight twoClasses = new Flight(new TwoClasses(passengerQuantityList));
		Flight multiClasses = new Flight(new MultiClasses(passengerQuantityList));
		

		System.out.println("Total Revenue of Single Class is " + singleClass.getTotalRevenue());
		System.out.println("Total Revenue of Two Classes is " + twoClasses.getTotalRevenue());
		System.out.println("Total Revenue of Multi Classes is " + multiClasses.getTotalRevenue());

	}

}

/**
 * 
 */
package asd.day7.lab82;

/**
 * @author luatnguyen
 *
 */
public class CustomerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Address addr1 = new Address("900 N 10th St", "Fairfield", "IA", "52556");
		Address addr2 = new Address("5105 N Austin ave", "Chicago", "IL", "60630");
		Address addr3 = new Address("4900 N Negal ave", "Chicago", "IL", "60630");
		Address addr4 = new Address("1302 S Main St", "Fairfield", "IA", "60630");

		HealthProfile profile1 = new HealthProfile("Luat Nguyen's Health Profile");
		HealthProfile profile2 = new HealthProfile("Dan Cao's Health Profile");
		HealthProfile profile3 = new HealthProfile("Dat Doan's Health Profile");
		HealthProfile profile4 = new HealthProfile("Vu Le's Health Profile");

		GoogleMap map1 = MapFactory.getGoogleMap(addr1.getCity());
		System.out.println("GoogleMap for city: " + addr1.getCity() + " and memory adress is: " + map1);
		GoogleMap map2 = MapFactory.getGoogleMap(addr2.getCity());
		System.out.println("GoogleMap for city: " + addr2.getCity() + " and memory adress is: " + map2);
		GoogleMap map3 = MapFactory.getGoogleMap(addr3.getCity());
		System.out.println("GoogleMap for city: " + addr3.getCity() + " and memory adress is: " + map3);
		GoogleMap map4 = MapFactory.getGoogleMap(addr4.getCity());
		System.out.println("GoogleMap for city: " + addr4.getCity() + " and memory adress is: " + map4);

		Image img1 = new Image(1234, 4321, map1);
		Image img2 = new Image(5678, 8765, map2);
		Image img3 = new Image(9876, 6789, map3);
		Image img4 = new Image(4567, 7656, map4);

		Customer cust1 = new Customer(1, "Luat", "Nguyen");
		cust1.setResidenceAddress(addr1);
		cust1.setProfile(profile1);
		cust1.setLocationMap(img1);
		System.out.println(cust1.toString());
		Customer cust2 = new Customer(2, "Luat", "Nguyen");
		cust2.setResidenceAddress(addr2);
		cust2.setProfile(profile2);
		cust2.setLocationMap(img2);
		System.out.println(cust2.toString());
		Customer cust3 = new Customer(3, "Luat", "Nguyen");
		cust3.setResidenceAddress(addr3);
		cust3.setProfile(profile3);
		cust3.setLocationMap(img3);
		System.out.println(cust3.toString());
		Customer cust4 = new Customer(4, "Luat", "Nguyen");
		cust4.setResidenceAddress(addr4);
		cust4.setProfile(profile4);
		cust4.setLocationMap(img4);
		System.out.println(cust4.toString());

	}

}

package lab10_1;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Chandra Panday", "641-451-4512");
		Customer customer2 = new Customer("Han Hong Lu", "641-451-3015");
		List<Customer> customers = Arrays.asList(customer1, customer2);
		Address address = new Address("1000 N 4th Street", "Fairfield", "IA", "52557");

		Agent agent = new Agent("1", address);

		RequestDirector director = new RequestDirector();
		director.initRequest(agent);
		director.buildRequest(customers, "641-451-4512", "Chandra Panday", "Request information here", "Response information here");
		director.saveRequest(true, false);

		director.initRequest(agent);
		director.buildRequest(customers, "641-451-3011", "Nirmal Subedi", "Request information here", "Response information here");
		director.saveRequest(true, false);

	}
}

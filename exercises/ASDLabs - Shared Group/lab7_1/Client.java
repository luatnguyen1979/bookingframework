package lab7_1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private ChainBuilder chain;

	public Client() {
		chain = new ChainBuilder();
	}

	public void sendRequest(List<CallRecord> callRecords) {
		chain.getHandler().handleRequest(callRecords);
	}

	public static void main(String[] args) {
		List<CallRecord> callRecords = new ArrayList<>();
		Address address1 = new Address("1000N 4th Street", "Fairfield", "IA", "52557");
		Customer customer1 = new Customer("Chandra", "Panday", address1, "641-451-4512", "chandra.panday.5@gmail.com");
		CallRecord callRecord1 = new CallRecord(customer1, "urgent request order");
		callRecords.add(callRecord1);
		
		Address address2 = new Address("1100N 4th Street", "Fairfield", "IA", "52556");
		Customer customer2 = new Customer("Joe", "Bruen", address2, "641-472-1215", "jbruen@mum.edu");
		CallRecord callRecord2 = new CallRecord(customer2, "normal request order");
		callRecords.add(callRecord2);
		
		Address address3 = new Address("2200 4th Street", "Fairfield", "TX", "64115");
		Customer customer3 = new Customer("Hanhong", "Lu", address3, "641-451-1234", "hlu@mum.edu");
		CallRecord callRecord3 = new CallRecord(customer3, "urgent request order with no reporter");
		callRecords.add(callRecord3);
		
		CallRecord callRecord4 = new CallRecord(null, "no information of customer request order");
		callRecords.add(callRecord4);
		
		Client client = new Client();
		client.sendRequest(callRecords);
	}
}
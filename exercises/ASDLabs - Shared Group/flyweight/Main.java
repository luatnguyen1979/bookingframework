package flyweight;

public class Main {

	public static void main(String[] args) {
		ConcreteCustomer concreteCustomer = CustomerFactory.getCustomer(City.Fairfield);
		concreteCustomer.logCustomerInfo("1", "Lokesh", "");
		
		UnsharedCustomer unsharedCustomer = new UnsharedCustomer(City.Grinnel, "Bhattarai");
		unsharedCustomer.logCustomerInfo("2", "Lokesh", unsharedCustomer.getLastName());
	}

}

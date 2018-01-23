package usa.edu.mum.asd.labs.lab7.builder;

public class Database {

    public Customer getCustomer(String phone) {
        Address address = new Address("2000 North Court Street, 16C", "Fairfield", "Iowa",
                "52556");
        return new Customer("Enkh", "Erdenebat", address, phone, "eerdenebat@mum.edu");
    }

    public boolean isSaleLead(String phone) {
        return phone.startsWith("641");
    }
}

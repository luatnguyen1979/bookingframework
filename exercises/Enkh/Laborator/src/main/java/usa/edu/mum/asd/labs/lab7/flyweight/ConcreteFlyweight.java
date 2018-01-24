package usa.edu.mum.asd.labs.lab7.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private LocationMap location;

    public ConcreteFlyweight(LocationMap location) {
        this.location = location;
    }

    @Override
    public void print(Customer customer) {
        System.out.println("==============================");
        customer.setLocationMap(location);
        System.out.println(customer.toString());
        System.out.println(customer.toString());
    }

    @Override
    public void save(Customer customer) {
        customer.setLocationMap(location);
        // save to db;
    }

    @Override
    public Customer build(Customer customer) {
        customer.setLocationMap(location);
        return customer;
    }
}

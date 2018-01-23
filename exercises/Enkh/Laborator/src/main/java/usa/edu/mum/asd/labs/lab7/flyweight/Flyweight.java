package usa.edu.mum.asd.labs.lab7.flyweight;

public interface Flyweight {

    public void print(Customer customer);

    public void save(Customer customer);

    public Customer build(Customer customer);
}

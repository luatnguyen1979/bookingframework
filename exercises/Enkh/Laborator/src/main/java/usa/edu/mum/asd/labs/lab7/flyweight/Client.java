package usa.edu.mum.asd.labs.lab7.flyweight;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        //test with flyweight
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Address validAddress = new Address("2000 North Court Street, 16C", "Fairfield", "Iowa",
                    "52556");
            HealthProfile healthProfile = new HealthProfile(123, LocalDate.of(1987, 06, 13), 31, true);
            Customer customer = new Customer(1, "Enkh", "Erdeneabt", validAddress, healthProfile);
            Flyweight flyweight = FlyweightFactory.getInstance("Fairfield, Iowa");
            flyweight.build(customer);
        }
        Long end = System.currentTimeMillis();
        start = System.currentTimeMillis();
        System.out.println("Test1 result. Run time=" + ((end - start) / 1000));
        //test without flyweight
        for (int i = 0; i < 100; i++) {
            Address validAddress = new Address("2000 North Court Street, 16C", "Fairfield", "Iowa",
                    "52556");
            HealthProfile healthProfile = new HealthProfile(123, LocalDate.of(1987, 06, 13), 31, true);
            Customer customer = new Customer(1, "Enkh", "Erdeneabt", validAddress, healthProfile);
            LocationMap locationMap = new LocationMap("Fairfield, Iowa", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
            customer.setLocationMap(locationMap);
        }
        end = System.currentTimeMillis();
        System.out.println("Test2 result. Run time=" + ((end - start) / 1000));
    }
}

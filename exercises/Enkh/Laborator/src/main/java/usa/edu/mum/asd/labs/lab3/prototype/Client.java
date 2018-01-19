package usa.edu.mum.asd.labs.lab3.prototype;

public class Client {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setFirstname("Eegii1");
        emp1.setLastname("Erdenebat");
        emp1.setCity("Fairfield");
        emp1.setId(1);
        emp1.setState("Iowa");
        emp1.setStreetAddress("2000 North Court Street");
        emp1.setZipcode("52556");

        Employee emp2 = new Employee();
        emp2.setFirstname("Eegii2");
        emp2.setLastname("Erdenebat");
        emp2.setCity("Fairfield");
        emp2.setId(1);
        emp2.setState("Iowa");
        emp2.setStreetAddress("2000 North Court Street");
        emp2.setZipcode("52556");

        Employee supervisor = new Employee();
        supervisor.setFirstname("Supervisor");
        supervisor.setSupervisor(emp2);
        Employee[] list = new Employee[1];
        list[0] = emp1;
        supervisor.setStaff(list);

        emp1.setSupervisor(supervisor);

        System.out.println("person 1:" + emp1.getFirstname());
        Employee test = (Employee) emp1.doClone();
        System.out.println("person 2:" + test.getFirstname());
    }
}

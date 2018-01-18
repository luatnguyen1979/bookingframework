package usa.edu.mum.asd.labs.lab3.prototype;

public class Client {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setFirstname("Eegii");
        Employee supervisor = new Employee();
        Employee[] list = new Employee[1];
        list[0] = emp1;
        supervisor.setStaff(list);
        supervisor.setFirstname("Supervisor");
        supervisor.setSupervisor(emp1);
        emp1.setSupervisor(supervisor);
        System.out.println("person 1:" + emp1.getFirstname());
        Employee emp2 = (Employee) emp1.doClone();
        System.out.println("person 2:" + emp2.getFirstname());
    }
}

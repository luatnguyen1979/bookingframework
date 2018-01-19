package usa.edu.mum.asd.labs.lab3.prototype;

import java.io.*;

public class Employee implements Cloneable, Serializable, Prototype {

    private String lastname;
    private String firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];
    private int id;
    private boolean supervisorCloned = false;
    private boolean staffCloned = false;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSupervisorCloned() {
        return supervisorCloned;
    }

    public void setSupervisorCloned(boolean supervisorCloned) {
        this.supervisorCloned = supervisorCloned;
    }

    public boolean isStaffCloned() {
        return staffCloned;
    }

    public void setStaffCloned(boolean staffCloned) {
        this.staffCloned = staffCloned;
    }

    /**
     * Deep copy.
     *
     * @return
     */
    @Override
    protected Object clone() {
        Employee emp = deepClone1(this, this);
        emp.supervisor.supervisor = null;
        emp.supervisor.staff[0] = this; //complete it by removing other staff
        return emp;
    }

    private Employee deepClone2(Employee start, Employee e1) {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // serialize and pass the object
            oos.writeObject(this);
            oos.flush();
            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bin);
            // return the new object
            return (Employee) ois.readObject();
        } catch (Exception e) {
            System.out.println("Exception in ObjectCloner = " + e);
            return null;
        } finally {
            try {
                oos.close();
                ois.close();
            } catch (IOException ioe) {
            }
        }
    }

    private Employee deepClone1(Employee start, Employee e1) {
        // this just shows the idea how to do it
        Employee e = new Employee();
        // set all attributes to the instance
        e.lastname = e1.lastname == null ? null : new String(e1.lastname);
        e.firstname = e1.firstname == null ? null : new String(e1.firstname);
        e.streetAddress = e1.streetAddress == null ? null : new String(e1.streetAddress);
        e.city = e1.city == null ? null : new String(e1.city);
        e.state = e1.state == null ? null : new String(e1.state);
        e.zipcode = e1.zipcode == null ? null : new String(e1.zipcode);
        e.id = e1.id;

        // check if the employee has a supervisor
        if (e1.supervisor != null) {
            e1.supervisorCloned = true;
            e.supervisor = deepClone1(start, e1.supervisor);
        }

        if (this != e1) { //running inside a recursive call
            // check if the employee has direct reports
            if (e1.staff != null && e1.staff.length > 0) {
                e.staff = new Employee[1];
                for (Employee emp : e1.staff) {
                    if (emp != null && emp.supervisor == e1) {
                        e.staff[0] = emp;
                        break;
                    }
                }
            }
        } else {
            if (e1.staff != null && e1.staff.length > 0) {
                e.staff = new Employee[e1.staff.length];
                int i = 0;
                for (Employee emp : e1.staff) {
                    if (emp != null && emp.supervisor == e1) {
                        e.staff[i] = emp.deepClone1(emp, emp);
                        e.staff[i].supervisor = e;
                    }
                    i++;
                }
            }

        }
        return e;

    }

    /**
     * Shallow copy.
     *
     * @return
     */
    public Prototype doClone() {
        Employee ret = new Employee();
        ret.lastname = this.lastname == null ? null : new String(this.lastname);
        ret.firstname = this.firstname == null ? null : new String(this.firstname);
        ret.streetAddress = this.streetAddress == null ? null : new String(this.streetAddress);
        ret.city = this.city == null ? null : new String(this.city);
        ret.state = this.state == null ? null : new String(this.state);
        ret.zipcode = this.zipcode == null ? null : new String(this.zipcode);
        ret.id = this.id;
        if (this.supervisor == null) {
            ret.supervisor = null;
        } else {
            if (!this.supervisor.supervisorCloned) {

            }
        }

        ret.staff = this.staff;
        return ret;
    }
}

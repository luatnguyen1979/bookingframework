package usa.edu.mum.asd.labs.lab8.memento;

public class UserProfile {

    private final String id;
    private String firstname;
    private String lastname;
    private String fullName;

    public UserProfile(String firstname, String lastname) {
        this.id = String.valueOf(System.currentTimeMillis());
        this.firstname = firstname;
        this.lastname = lastname;
        buildFullName();
    }

    public UserProfile(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        buildFullName();
    }

    public void buildFullName() {
        fullName = firstname + " " + lastname;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Memento getMemento() {
        return new Memento(id, firstname, lastname);
    }

    public void setMemento(Memento memento) {
        if (memento == null) return;
        firstname = memento.getFirstname();
        lastname = memento.getLastname();
        buildFullName();
    }
}

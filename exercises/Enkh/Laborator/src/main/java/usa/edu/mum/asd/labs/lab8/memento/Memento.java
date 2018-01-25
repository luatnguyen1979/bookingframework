package usa.edu.mum.asd.labs.lab8.memento;

class Memento {

    private final String id;
    private final String firstname;
    private final String lastname;

    public Memento(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }
}
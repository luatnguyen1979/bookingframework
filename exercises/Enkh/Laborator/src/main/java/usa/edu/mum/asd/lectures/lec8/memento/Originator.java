package usa.edu.mum.asd.lectures.lec8.memento;

/**
 * This class must be big.
 */
public class Originator {

    private String argument1;
    private Integer argument2;
    private String argument3;

    public Originator(String argument1, Integer argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    public void setArgument3(String argument3) {
        this.argument3 = argument3;
    }

    public void setArgument1(String argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(Integer argument2) {
        this.argument2 = argument2;
    }

    public void setMemento(Memento memento) {
        this.argument1 = memento.getArgument1();
        this.argument2 = memento.getArgument2();
    }

    public Memento createMemento() {
        return new Memento(argument1, argument2);
    }

    public void print() {
        System.out.println(argument1);
        System.out.println(argument2);
        System.out.println(argument3);
    }
}
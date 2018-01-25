package usa.edu.mum.asd.lectures.lec8.memento;

public class Client {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("1", 2);
        originator.setArgument3("3");
        originator.print();
        // create snapshot
        Memento memento = originator.createMemento();
        careTaker.add(memento);
        System.out.println(memento.getArgument1());
        originator.setArgument1("11");
        originator.setArgument2(12);
        originator.print();
        originator.setMemento(memento);
        originator.print();
    }
}

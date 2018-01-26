package usa.edu.mum.asd.lectures.lec9.state;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter. Gumball is out of stock.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject a quarter. There is no quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank. Gumball is out of stock.");
    }

    @Override
    public void dispense() {
        System.out.println("You cant dispense gumball. Gumball is out of stock.");
    }
}

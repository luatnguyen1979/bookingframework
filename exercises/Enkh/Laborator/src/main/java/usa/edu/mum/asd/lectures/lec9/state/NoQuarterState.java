package usa.edu.mum.asd.lectures.lec9.state;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject a quarter. There is no quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank. There is no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("You can't dispense gumball. Please, insert a quarter.");
    }
}

package usa.edu.mum.asd.lectures.lec9.state;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("");
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank again. You already turned crank.");
    }

    @Override
    public void dispense() {
        System.out.println("Gumball is dispensed.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}

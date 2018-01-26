package usa.edu.mum.asd.lectures.lec9.state;

public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
package usa.edu.mum.asd.labs.lab9.state;

public interface State {

    public int moveLeft();

    public int moveRight();

    public int accelerateSpeed();

    public int breakSpeed();

    public String getName();

}

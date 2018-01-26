package usa.edu.mum.asd.labs.lab9.state;

public class IceState implements State {

    Game game;

    public IceState(Game game) {
        this.game = game;
    }

    @Override
    public int moveLeft() {
        System.out.println("Moving to left. Value=1");
        return 1;
    }

    @Override
    public int moveRight() {
        System.out.println("Moving to left. Value=1");
        return 1;
    }

    @Override
    public int accelerateSpeed() {
        System.out.println("Accelerate speed. Value=3");
        return 3;
    }

    @Override
    public int breakSpeed() {
        System.out.println("Breaking speed. Value=2");
        return 2;
    }

    public String getName() {
        return "Ice";
    }
}

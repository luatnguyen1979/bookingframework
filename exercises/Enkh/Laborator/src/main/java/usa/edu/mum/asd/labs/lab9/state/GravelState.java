package usa.edu.mum.asd.labs.lab9.state;

public class GravelState implements State {

    Game game;

    public GravelState(Game game) {
        this.game = game;
    }

    @Override
    public int moveLeft() {
        System.out.println("Moving to left. Value=3");
        return 3;
    }

    @Override
    public int moveRight() {
        System.out.println("Moving to left. Value=3");
        return 3;
    }

    @Override
    public int accelerateSpeed() {
        System.out.println("Accelerate speed. Value=7");
        return 7;
    }

    @Override
    public int breakSpeed() {
        System.out.println("Breaking speed. Value=6");
        return 6;
    }

    public String getName() {
        return "Gravel";
    }
}

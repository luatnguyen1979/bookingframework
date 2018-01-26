package usa.edu.mum.asd.labs.lab9.state;

public class WetState implements State {

    Game game;

    public WetState(Game game) {
        this.game = game;
    }

    @Override
    public int moveLeft() {
        System.out.println("Moving to left. Value=4");
        return 4;
    }

    @Override
    public int moveRight() {
        System.out.println("Moving to left. Value=4");
        return 4;
    }

    @Override
    public int accelerateSpeed() {
        System.out.println("Accelerate speed. Value=9");
        return 9;
    }

    @Override
    public int breakSpeed() {
        System.out.println("Breaking speed. Value=7");
        return 7;
    }

    public String getName() {
        return "Wet";
    }
}

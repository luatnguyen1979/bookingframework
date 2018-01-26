package usa.edu.mum.asd.labs.lab9.state;

public class RegularState implements State {

    Game game;

    public RegularState(Game game) {
        this.game = game;
    }

    @Override
    public int moveLeft() {
        System.out.println("Moving to left. Value=5");
        return 5;
    }

    @Override
    public int moveRight() {
        System.out.println("Moving to left. Value=5");
        return 5;
    }

    @Override
    public int accelerateSpeed() {
        System.out.println("Accelerate speed. Value=9");
        return 9;
    }

    @Override
    public int breakSpeed() {
        System.out.println("Breaking speed. Value=8");
        return 8;
    }

    public String getName() {
        return "Regular";
    }
}

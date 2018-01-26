package usa.edu.mum.asd.labs.lab9.state;

public class Game {

    private State regularState;
    private State gravelState;
    private State wetState;
    private State iceState;
    private int countPressed;
    private int totalPressedPerState;
    private int sum;
    private int target;
    private State currentState;


    public Game(int totalPressedPerState, int target) {
        this.regularState = new RegularState(this);
        this.gravelState = new GravelState(this);
        this.wetState = new WetState(this);
        this.iceState = new IceState(this);
        this.countPressed = 0;
        this.currentState = regularState;
        this.totalPressedPerState = totalPressedPerState;
        this.target = target;
        this.sum = 0;
    }

    public void startGame() {
        System.out.println("=====================================================");
        System.out.println("Game is started");
        countPressed = 0;
        sum = 0;
        currentState = regularState;
    }

    private void checkGame() {
        countPressed++;
        if (countPressed == totalPressedPerState) {
            countPressed = 0;
            if (currentState == regularState) {
                currentState = gravelState;
                return;
            }
            if (currentState == gravelState) {
                currentState = wetState;
                return;
            }
            if (currentState == wetState) {
                currentState = iceState;
                return;
            }
            if (currentState == iceState) {
                System.out.println("You lose!!!");
                startGame();
                return;
            }
        }
        if (sum > target) {
            System.out.println("You lose!!!");
            startGame();
        } else if (sum == target) {
            System.out.println("You won!!!");
            startGame();
        }
    }


    public void moveLeft() {
        sum = sum + currentState.moveLeft();
        checkGame();
    }

    public void moveRight() {
        sum = sum + currentState.moveRight();
        checkGame();
    }

    public void accelerateSpeed() {
        sum = sum + currentState.accelerateSpeed();
        checkGame();
    }

    public void breakSpeed() {
        sum = sum + currentState.breakSpeed();
        checkGame();
    }

    public int getSum() {
        return sum;
    }

    public int getTarget() {
        return target;
    }

    public State getCurrentState() {
        return currentState;
    }
}

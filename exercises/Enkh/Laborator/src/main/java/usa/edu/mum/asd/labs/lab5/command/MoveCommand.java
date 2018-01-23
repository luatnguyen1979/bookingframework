package usa.edu.mum.asd.labs.lab5.command;

public class MoveCommand implements Command {

    private Square square;
    private int distance;

    public MoveCommand(Square square, int distance) {
        this.square = square;
        this.distance = distance;
    }

    @Override
    public boolean execute() {
        return square.move(distance);
    }

    @Override
    public boolean undo() {
        return square.undo();
    }
}

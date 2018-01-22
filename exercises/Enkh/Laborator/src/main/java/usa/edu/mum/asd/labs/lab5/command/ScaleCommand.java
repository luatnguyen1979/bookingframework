package usa.edu.mum.asd.labs.lab5.command;

public class ScaleCommand implements Command {

    private Square square;
    private int rate;

    public ScaleCommand(Square square, int rate) {
        this.square = square;
        this.rate = rate;
    }

    @Override
    public boolean execute() {
        return square.scale(rate);
    }

    @Override
    public boolean undo() {
        return square.undo();
    }
}

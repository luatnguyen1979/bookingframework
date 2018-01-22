package usa.edu.mum.asd.labs.lab5.command;

public class CreateCommand implements Command {

    private Square square;
    private int size;

    public CreateCommand(Square square, int size) {
        this.square = square;
        this.size = size;
    }

    @Override
    public boolean execute() {
        return square.create(size);
    }

    @Override
    public boolean undo() {
        return square.undo();
    }
}

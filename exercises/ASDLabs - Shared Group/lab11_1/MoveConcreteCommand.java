package lab11_1;

public class MoveConcreteCommand implements Command {
	Square square;
	Direction direction;
	int steps;

	public MoveConcreteCommand(Square square, Direction direction, int steps) {
		this.square = square;
		this.direction = direction;
		this.steps = steps;
	}

	@Override
	public void execute() {
		square.move(direction, steps);
	}

	@Override
	public void undo() {
		Direction undoDirection = (direction == Direction.LEFT) ? Direction.RIGHT : Direction.LEFT;
		square.move(undoDirection, steps);
	}

}

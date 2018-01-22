/**
 * 
 */
package asd.day5.lab62;

/**
 * @author luatnguyen
 *
 */
public class MovingConcreteCommand implements Command {
	Square square;
	Direction direction;
	int steps;

	public MovingConcreteCommand(Square square, Direction direction, int steps) {
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
		Direction tempDirection = (direction == Direction.LEFT) ? Direction.RIGHT : Direction.LEFT;
		square.move(tempDirection, steps);
	}

}

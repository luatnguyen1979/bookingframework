package asd.day5.lab62;

/**
 * @author luatnguyen
 *
 */
public class Main {
	public static void main(String[] args) {

		SquareController squareController = new SquareController();

		CreatingConcreteCommand createConcreteCommand = new CreatingConcreteCommand(7);
		squareController.setCommand(createConcreteCommand);
		squareController.execute();
		Square square = createConcreteCommand.getSquare();

		ScalingConcreteCommand scaleConcreteCommand = new ScalingConcreteCommand(square, 5);
		squareController.setCommand(scaleConcreteCommand);
		squareController.execute();
		squareController.undoCommand();

		MovingConcreteCommand moveConcreteCommand = new MovingConcreteCommand(square, Direction.RIGHT, 6);
		squareController.setCommand(moveConcreteCommand);
		squareController.execute();
		squareController.undoCommand();
	}
}

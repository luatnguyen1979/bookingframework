package lab11_1;

public class Main {
	public static void main(String[] args) {

		SquareController squareController = new SquareController();

		CreateConcreteCommand createConcreteCommand = new CreateConcreteCommand(5);
		squareController.setCommand(createConcreteCommand);
		squareController.execute();
		Square square = createConcreteCommand.getSquare();

		ScaleConcreteCommand scaleConcreteCommand = new ScaleConcreteCommand(square, 3);
		squareController.setCommand(scaleConcreteCommand);
		squareController.execute();
		squareController.undoCommand();

		MoveConcreteCommand moveConcreteCommand = new MoveConcreteCommand(square, Direction.LEFT, 3);
		squareController.setCommand(moveConcreteCommand);
		squareController.execute();
		squareController.undoCommand();
	}
}

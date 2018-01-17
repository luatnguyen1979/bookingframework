package lab11_1;

public class ScaleConcreteCommand implements Command{
	int multiply;
	Square square;
	
	public ScaleConcreteCommand(Square square, int mul){
		this.square = square;
		this.multiply = mul;
	}
	
	@Override
	public void execute() {
		square.scale(multiply);
	}

	@Override
	public void undo() {
		int x = square.getX();
		square = new Square(x/multiply);
	}

}

package lab11_1;

public class CreateConcreteCommand implements Command{
	Square square;
	int x;
	
	public CreateConcreteCommand(int x){
		this.x  = x;
	}
	@Override
	public void execute() {
		square = new Square(x);
	}

	@Override
	public void undo() {
		x = 0;
	}
	
	public Square getSquare(){
		return square;
	}

}
